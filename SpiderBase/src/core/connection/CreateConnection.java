package core.connection;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import rule.IRequestRule;
import vo.RequestVO;

public class CreateConnection {
	
	private RequestVO[] operateVOs = null;
		
	// 防止重复校验
	private Map<String, IRequestRule> beforeRule = new HashMap<String, IRequestRule>();
	// 防止重复校验
	private Map<String, IRequestRule> afterRule = new HashMap<String, IRequestRule>();
		
	
	public CreateConnection(RequestVO[] reqVOs){
		this.operateVOs = reqVOs;
	}
	
	public void addBeforeCheckRule(IRequestRule rule){
		if(null != rule){
			String ruleName = rule.getClass().getCanonicalName();
			if(!beforeRule.containsKey(ruleName)){
				beforeRule.put(ruleName, rule);
			}
		}		
	}
	
	public void addAfterCheckRule(IRequestRule rule){
		if(null != rule){
			String ruleName = rule.getClass().getName();
			if(!afterRule.containsKey(ruleName)){
				afterRule.put(ruleName, rule);
			}
		}		
	}
	
	private Document[] setConnection(){		
		if(null != this.operateVOs){
			Document[] docs = new Document[this.operateVOs.length];
			int index = 0;
			for(RequestVO vo : this.operateVOs){
				String url = vo.getUrl();
				String[] params = vo.getParams();
				String[] values = vo.getValues();
				int requestType = vo.getRequestMoethod();
				Connection conn = Jsoup.connect(url);
				if (params != null){
					for (int i = 0; i < params.length; i++){
						conn.data(params[i], values[i]);
					}
				}
				switch (requestType){
				case RequestVO.GET:
					try {
						docs[index ++] = conn.timeout(100000).get();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						docs[index] = null;
					}
					break;
				case RequestVO.POST:
					try {
						docs[index ++] = conn.timeout(100000).post();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						docs[index] = null;
					}
					break;
				}
			}
			return docs;
		}
		return null;
	}
	
	public Document[] deal(){
		Document[] document = null;
		
		Iterator<IRequestRule> ite = beforeRule.values().iterator();
		while(ite.hasNext()){
			ite.next().operate(this.operateVOs);
		}
		
		document = setConnection();
		
		ite = afterRule.values().iterator();
		while(ite.hasNext()){
			ite.next().operate(this.operateVOs);
		}
		
		return document;
	}
}
