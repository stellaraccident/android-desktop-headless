package android.text;

import java.text.Annotation;

import android.os.Parcel;
import android.os.Parcelable;

public class TextUtils {

    public static final Parcelable.Creator<CharSequence> CHAR_SEQUENCE_CREATOR
    = new Parcelable.Creator<CharSequence>() {
		/**
		 * Read and return a new CharSequence, possibly with styles,
		 * from the parcel.
		 */
		public  CharSequence createFromParcel(Parcel p) {
			p.readInt();
	        return p.readString();
		}
		
		public CharSequence[] newArray(int size)
		{
		    return new CharSequence[size];
		}
		};
		
		
	/**
     * Flatten a CharSequence and whatever styles can be copied across processes
     * into the parcel.
     */
    public static void writeToParcel(CharSequence cs, Parcel p,
            int parcelableFlags) {
        p.writeInt(1);
        if (cs != null) {
            p.writeString(cs.toString());
        } else {
            p.writeString(null);
        }
    }
		
}
