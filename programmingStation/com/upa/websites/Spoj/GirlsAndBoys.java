package com.upa.websites.Spoj;

import java.io.*;
import java.util.StringTokenizer;

public class GirlsAndBoys {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    void run() throws Exception {
        while (true) {
            StringTokenizer tokenizer = new StringTokenizer(in.readLine());
            int girls = Integer.parseInt(tokenizer.nextToken());
            int boys = Integer.parseInt(tokenizer.nextToken());
            if (girls == -1 && boys == -1)
                break;
            solve(girls, boys);
        }
        out.flush();
    }

    void solve(int girls, int boys) {
        if (boys > girls) {
            solve(boys, girls);
            return;
        }
        out.println((int) Math.ceil(girls/(boys+1.0)));
    }

    public static void main(String[] args) throws Exception {
        new GirlsAndBoys().run();
    }
}