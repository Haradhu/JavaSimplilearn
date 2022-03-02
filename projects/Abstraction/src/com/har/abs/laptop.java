package com.har.abs;

public class laptop {
	private Harddisk hd;
	

	public laptop(Harddisk hd) {
		super();
		this.hd = hd;
	}


	public static void main(String[] args) {
		Harddisk hd= new KingstonHD();
		laptop laptop1=new laptop(hd);
		System.out.println(laptop1.hd.size());
		System.out.println(laptop1.hd.speed());
	}

}
