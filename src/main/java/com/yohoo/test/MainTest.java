package com.yohoo.test;


import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.apache.axis.encoding.XMLType;

import javax.xml.namespace.QName;
import javax.xml.rpc.ParameterMode;

/**
 * Created by kaikentule on 2019/9/4.
 */
public class MainTest {
    public static void main(String[] args) {
        //字符集
        String encodingStyle = "UTF-8";
        //WSDL的地址
        String endpoint = "http://ws.webxml.com.cn/WebServices/MobileCodeWS.asmx?wsdl";
        //命名空间                                    
        String targetNamespace = "http://WebXml.com.cn/";
        //具体调用的方法名
        String method = "getMobileCodeInfo";
        //具体方法的调用URI
        String soapActionURI = targetNamespace + method;
        try {
            //调用接口的参数的名字
            String[] paramNames = {"mobileCode"};
            //调用接口的参数的值
            String[] paramValues = {"18523356321"};

            Service service = new Service();
            Call call = (Call) service.createCall();
            call.setSOAPActionURI(soapActionURI);
            call.setTargetEndpointAddress(new java.net.URL(endpoint));  //设置目标接口的地址
            call.setEncodingStyle(encodingStyle);//设置传入服务端的字符集格式如utf-8等
            call.setOperationName(new QName(targetNamespace, method));// 具体调用的方法名，可以由接口提供方告诉你，也可以自己从WSDL中找
            call.setUseSOAPAction(true);
            call.addParameter(new QName(targetNamespace, paramNames[0]), XMLType.XSD_STRING, ParameterMode.IN);// 接口的参数
            call.setReturnType(org.apache.axis.encoding.XMLType.XSD_STRING);// 设置返回类型  ，如String
//            call.setReturnClass(java.lang.String[].class); //返回字符串数组类型
            // 给方法传递参数，并且调用方法 ，如果无参，则new Obe
            String result = (String)call.invoke(new Object[]{paramValues[0]});
            // 打印返回值
            System.err.println("result is " + result.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
