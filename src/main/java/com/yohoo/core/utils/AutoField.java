package com.yohoo.core.utils;

/**
* @ClassName: AutoField
* @Description: 自动生成 表字段对应PO/BO
* @author linx
* @date 2015年8月14日 下午4:03:13
*/ 
public class AutoField {
	public static void main(String[] args) {
		String str = "appraisal_key_id, appraisal_id, appraisal_name, appraisal_key_weight, sort_no, oper_user_id, oper_time, status";
		StringBuffer sb = new StringBuffer();
		String[] s = str.split(",");
		String temp = null;
		for (int i = 0; i < s.length; i++) {
			String sTrim = s[i].trim();
			sb.append(sTrim);
			temp = sTrim.toLowerCase();
			int _sum = 0;
			for (int j = 0; j < temp.length(); j++) {
				if(("_").equals(temp.substring(j, j+1))){
					_sum++;
				}
			}
			for (int k = 0; k < _sum; k++) {
				int _index = temp.indexOf("_");
				if(_index > 0){
					temp = temp.substring(0,_index) + temp.substring(_index+1,_index+2).toUpperCase() + temp.substring(_index+2);
				}
			}
			if(i+1 == s.length){
				sb.append(" " + temp + " ");
			}else{
				sb.append(" " + temp + ", ");
			}
		}
		System.err.println(sb.toString());
	}
}
