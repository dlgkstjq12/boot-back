package com.api.bootBack.financialProject;

public class ApiConstants {
    public static final String API_KEY = "e0de8fa4ce4c19d0e09d77b28feacba1@content2@";  //기본 인증키 (개인)
    public static final String SUCCESS_CODE = "200";
    
    //정기예금 관련 API 
    //https://finlife.fss.or.kr/finlife/api/fdrmDpstApi/list.do?menuNo=700052
    
    
    //응답방식    -   
    //text    
    //필수  
    //* API호출 후 받을 결과 값 형태 선택.
    //Ex) xml, json
    public static final String RETURN_CODE = "xml"; //API호출 후 받을 결과 값 형태 선택
    
    
    //* 금융회사가 속한 권역 코드
    //Ex) 020000(은행), 030200(여신전문), 030300(저축은행), 050000(보험), 060000(금융투자)
    //권역코드    
    //topFinGrpNo 
    //text
    public static final String TOP_FIN_GRP_NO_BNK_CODE = "020000";  //은행
    public static final String TOP_FIN_GRP_NO_CRF_CODE = "030200";  //여신전문
    public static final String TOP_FIN_GRP_NO_SVB_CODE = "030300";  //저축은행
    public static final String TOP_FIN_GRP_NO_INS_CODE = "050000";  //보험
    public static final String TOP_FIN_GRP_NO_FIN_CODE = "060000";  //금융투자
    
    
    
    //금융회사 코드 또는 명    
    //요청변수 ID : financeCd   
    //타입 : text    
    //설명 및 예시 :* 금융회사 코드 또는 명, Ex) 0010587, 0010588, 0010722, 국민, 상호, 하나
    //financeCd
    public static final String FINANCE_KB_CODE = "국민";
    public static final String FINANCE_SNG_CODE = "상호";
    public static final String FINANCE_HNA_CODE = "하나";

}
