package androidx.cursoradapter.widget;

import android.content.Context;
import android.database.Cursor;

/** AndroidX package compatibility wrapper delegating to the platform CursorAdapter. */
public abstract class CursorAdapter extends android.widget.CursorAdapter {
    public CursorAdapter(Context context, Cursor cursor) { super(context, cursor); }
    public CursorAdapter(Context context, Cursor cursor, boolean autoRequery) { super(context, cursor, autoRequery); }
    public CursorAdapter(Context context, Cursor cursor, int flags) { super(context, cursor, flags); }
}
