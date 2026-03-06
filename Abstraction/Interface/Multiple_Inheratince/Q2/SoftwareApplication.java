abstract class SoftwareApplication implements Openable,Closeable{
	public abstract void open();

	public abstract void signUp();

	public abstract void signIn();

	public abstract void signOut();

	public abstract void close();

}