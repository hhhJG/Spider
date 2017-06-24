package test;

import java.util.ArrayList;
import java.util.List;

import org.jsoup.nodes.Document;

import core.connection.CreateConnection;
import rule.RequestVOCheckRule;
import vo.RequestVO;
import vo.ResultParamVO;

public class LvDunTest {
	
	private RequestVO createReqVO(){
		RequestVO reqVO = new RequestVO();
		reqVO.setUrl("");
		String[] values = {};
		String[] params = {};
		reqVO.setParams(params);
		reqVO.setValues(values);
		reqVO.setRequestMoethod(RequestVO.GET);
		return reqVO;
	}
	
	private List<ResultParamVO> createResultParamVOs(){
		List<ResultParamVO> resParamVOs = new ArrayList<ResultParamVO>();
		
		ResultParamVO root = new ResultParamVO();
		root.putCondition("class", "innerBox");		
		resParamVOs.add(root);
		
		ResultParamVO root_a = new ResultParamVO("a", 0);
		root_a.putResultParam("text");
		resParamVOs.add(root_a);
		
		ResultParamVO root_td = new ResultParamVO("td", 0);
		root_td.putResultParam("text");
		resParamVOs.add(root_td);
		
		ResultParamVO root_td2 = new ResultParamVO("td", 1);
		root_td2.putResultParam("text");
		resParamVOs.add(root_td2);
		
		ResultParamVO root_td3 = new ResultParamVO("img", 0);
		root_td3.putResultParam("src");
		resParamVOs.add(root_td3);
		
		ResultParamVO root_td4 = new ResultParamVO("a", 0);
		root_td4.putResultParam("text");
		resParamVOs.add(root_td4);
		
		ResultParamVO root_td5 = new ResultParamVO("th", 4);
		root_td5.putResultParam("text");
		resParamVOs.add(root_td5);
		
		ResultParamVO root_td6 = new ResultParamVO("th", 5);
		root_td6.putResultParam("text");
		resParamVOs.add(root_td6);
		
		return resParamVOs;
	}
	
	public void run(){
		CreateConnection createConn = new CreateConnection(new RequestVO[]{createReqVO() });
		createConn.addBeforeCheckRule(new RequestVOCheckRule());
		
		Document[] documents = createConn.deal();
		if(null != documents){
			createResultParamVOs();
			
			for(Document doc : documents){				
				 
			}
		}
	}

	public static void main(String[] args) {
		
	}

}
