/*
 * Copyright (C) 2010 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package android.os;

import android.util.Log;
import android.util.Printer;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * <p>StrictMode is a developer tool which detects things you might be
 * doing by accident and brings them to your attention so you can fix
 * them.
 *
 * <p>StrictMode is most commonly used to catch accidental disk or
 * network access on the application's main thread, where UI
 * operations are received and animations take place.  Keeping disk
 * and network operations off the main thread makes for much smoother,
 * more responsive applications.  By keeping your application's main thread
 * responsive, you also prevent
 * <a href="{@docRoot}guide/practices/design/responsiveness.html">ANR dialogs</a>
 * from being shown to users.
 *
 * <p class="note">Note that even though an Android device's disk is
 * often on flash memory, many devices run a filesystem on top of that
 * memory with very limited concurrency.  It's often the case that
 * almost all disk accesses are fast, but may in individual cases be
 * dramatically slower when certain I/O is happening in the background
 * from other processes.  If possible, it's best to assume that such
 * things are not fast.</p>
 *
 * <p>Example code to enable from early in your
 * {@link android.app.Application}, {@link android.app.Activity}, or
 * other application component's
 * {@link android.app.Application#onCreate} method:
 *
 * <pre>
 * public void onCreate() {
 *     if (DEVELOPER_MODE) {
 *         StrictMode.setThreadPolicy(new {@link ThreadPolicy.Builder StrictMode.ThreadPolicy.Builder}()
 *                 .detectDiskReads()
 *                 .detectDiskWrites()
 *                 .detectNetwork()   // or .detectAll() for all detectable problems
 *                 .penaltyLog()
 *                 .build());
 *         StrictMode.setVmPolicy(new {@link VmPolicy.Builder StrictMode.VmPolicy.Builder}()
 *                 .detectLeakedSqlLiteObjects()
 *                 .penaltyLog()
 *                 .penaltyDeath()
 *                 .build());
 *     }
 *     super.onCreate();
 * }
 * </pre>
 *
 * <p>You can decide what should happen when a violation is detected.
 * For example, using {@link ThreadPolicy.Builder#penaltyLog} you can
 * watch the output of <code>adb logcat</code> while you use your
 * application to see the violations as they happen.
 *
 * <p>If you find violations that you feel are problematic, there are
 * a variety of tools to help solve them: threads, {@link android.os.Handler},
 * {@link android.os.AsyncTask}, {@link android.app.IntentService}, etc.
 * But don't feel compelled to fix everything that StrictMode finds.  In particular,
 * many cases of disk access are often necessary during the normal activity lifecycle.  Use
 * StrictMode to find things you did by accident.  Network requests on the UI thread
 * are almost always a problem, though.
 *
 * <p class="note">StrictMode is not a security mechanism and is not
 * guaranteed to find all disk or network accesses.  While it does
 * propagate its state across process boundaries when doing
 * {@link android.os.Binder} calls, it's still ultimately a best
 * effort mechanism.  Notably, disk or network access from JNI calls
 * won't necessarily trigger it.  Future versions of Android may catch
 * more (or fewer) operations, so you should never leave StrictMode
 * enabled in shipping applications on the Android Market.
 */
public final class StrictMode {

	public static void clearGatheredViolations() {
		throw new UnsupportedOperationException();
	}

	public static void writeGatheredViolationsToParcel(Parcel parcel) {
		throw new UnsupportedOperationException();
	}

	public static boolean hasGatheredViolations() {
		throw new UnsupportedOperationException();
	}

	public static void readAndHandleBinderCallViolations(Parcel parcel) {
		throw new UnsupportedOperationException();
	}
}