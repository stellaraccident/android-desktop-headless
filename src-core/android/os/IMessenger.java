package android.os;

public interface IMessenger extends IInterface {
	void send(Message msg);
	
	public static class Stub extends Binder implements IMessenger {
		public static IMessenger asInterface(IBinder obj) {
			throw new UnsupportedOperationException();
		}
		public IBinder asBinder() {
			throw new UnsupportedOperationException();
		}
		
		@Override
		public void send(Message msg) {
			throw new UnsupportedOperationException();
		}
		
	}
}
