import android.os.Handler;
import android.os.Looper;
import android.util.Log;


public class TestAndroidMain {
	public static class MyOnce implements Runnable {
		@Override
		public void run() {
			System.out.println("Once");
		}
	}
	
	public static class MyRunnable implements Runnable {
		@Override
		public void run() {
			Handler handler=new Handler();
			handler.postDelayed(new MyRunnable(), 1000);
			handler.post(new MyOnce());
			System.out.println("Running task");
			Log.d("Test", "Test run log message");
		}
	};
	
	public static void main(String[] args) {
		Looper.prepareMainLooper();
		new MyRunnable().run();
		Looper.loop();
	}
}
