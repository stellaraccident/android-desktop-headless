android-desktop-headless
========================
I had some backend networking code and bits that I wanted to be able to run on a standard
VM.  The threading and control flow made heavy use of Handler and Looper constructs
in addition to android's Log class.

This project builds an android-desktop-headless.jar that has enough classes to compile
my projects for use on a standard JVM.  In addition, the Looper stuff has been hand
modified to work outside of Android/Dalvik.

This is not a complete port in any way and has only been tested far enough to get me
running with what I need.  Feel free to use it as you wish.

Building
--------
Checkout the android source code per the instructions on their website and then
run

	ant package -Dandroid.src=/directory/of/android
	
You'll get an android-desktop-headless.jar file.

License
-------
What is here is covered by the hodge-podge of licenses that android itself is under.  Where code has
been lifted from the android source and copied locally into this project, copyrights and license
notices have been retained.

Most such source files are under the following license

	/*
	 * Copyright (C) 2006 The Android Open Source Project
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
		