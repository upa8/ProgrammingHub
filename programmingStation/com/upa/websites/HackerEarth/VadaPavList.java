package com.upa.websites.hackerEarth;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.TreeSet;

import com.upa.templates.MyScanner;

public class VadaPavList extends MyScanner {

	public static void main(String args[]) throws Exception {
		VadaPavList in = new VadaPavList();
		long t = in.nextInt();
		TreeSet<String> tr = new TreeSet<String>();
		while (t > 0) {
			tr.add(in.nextToken());
			t--;
		}
		long size = tr.size();
		BufferedWriter out = new BufferedWriter(
				new OutputStreamWriter(System.out));
		out.write(size + "\n");
		out.flush();
		Iterator<String> itr = tr.iterator();
		while (itr.hasNext()) {
			out.write(itr.next() + "\n");
			out.flush();
		}
	}
}
