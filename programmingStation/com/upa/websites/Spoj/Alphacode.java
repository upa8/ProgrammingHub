package com.upa.websites.spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Alphacode {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String cipher;
        while (!(cipher = in.readLine()).equals("0"))
            out.println(numOfDecoding(cipher));
        out.flush();
    }

    public static long numOfDecoding(String cipher) {
        long d0 = 1, d1 = cipher.charAt(cipher.length()-1)=='0' ? 0 : 1;
        for (int i = cipher.length()-2; i >= 0; i--) {
            if (cipher.charAt(i) == '0') { 
                d0 = d1;
                d1 = 0;
            } else {
                long temp = d1;
                if (cipher.charAt(i) == '1' || cipher.charAt(i) == '2' && cipher.charAt(i+1) <= '6')
                    temp += d0;
                d0 = d1;
                d1 = temp;
            }
        }
        return d1;
    }
}
