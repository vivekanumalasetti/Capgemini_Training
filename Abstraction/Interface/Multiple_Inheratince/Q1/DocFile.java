class DocFile implements Readable,Writable {
	@Override
	public void read() {
		System.out.println("It is a Readable in DocFile");
	}

	@Override
	public void write() {
		System.out.println("It is a Writable in DocFile");
	}
}