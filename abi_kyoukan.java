/*文字列strの文字全てに濁点を付けて出力 */

import java.io.*;

public class abi_kyoukan{

	public static void main(String[] args){

		String str = "こんにちは";

		for(int i=1; i <=str.length(); i++){

			StringBuilder sb = new StringBuilder();

			sb.append(str);
			sb.insert(i,"‟");

			System.out.println(new String(sb));

			subset += 2;

		}
	}
}