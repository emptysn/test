package com.test;

public class Mytest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b1 = (byte) 1004;
		p("字节转抱成10进制："+btye2Int(b1));
		p("10进制转字节：" + int2Byte(1025));
		byte[] b2 = new byte[]{(byte)0xFF,(byte)0xFA,(byte)0x11};
		p("字节转抱成16进制：" + bytes2HexString(b2));

	}
	
	/**
	 *  字节转10进制
	 * @param b
	 * @return
	 */
	public static int btye2Int(byte b){
		int r = (int) b ;
		return r ;
	}
	
	/**
	 * 10进制转字节
	 * @param i
	 * @return
	 */
	public static byte int2Byte(int i){
		byte r = (byte) i ;
		return r;
	}
	
	/**
	 *  字节数组转16进制字符串
	 * @param b
	 * @return
	 */
	public static String bytes2HexString(byte[] b){
		String r = "";
		for(int i = 0 ; i < b.length;i++){
			String hex = Integer.toHexString(b[i] & 0xFF);
			if(hex.length()==1){
				hex = '0' + hex ;
			}
			r += hex.toUpperCase();
		}
		return r;
	}
	
	private static byte charToByte(char c){
		return (byte) "0123456789ABCDEF".indexOf(c);
	}
	
	public static byte[] hexString2Bytes(String hex){
		if(hex ==null || "".equals(hex)){
			return null;
		}else if(hex.length() % 2 != 0){
			return null;
		}else{
			hex = hex.toUpperCase();
			int len = hex.length() / 2;
			byte[] b = new byte[len];
			char[] hc = hex.toCharArray();
			for(int i = 0 ; i < hc.length; i ++){
				int p = 2*i;
				b[i] = (byte)(charToByte(hc[p]) << 4 | charToByte(hc[p]) + 1);
				
			}
			return b;
		}
	}
	
//	public static String string2HexString(String s) throws Exception{
//		String r = 
//	}
	
	private static void p(Object object){
		System.out.println(object);
	}
	
	

}
