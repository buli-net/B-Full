package androidx.interpolator.view.animation;

import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/** Cubic Bezier fast-out-slow-in interpolator. */
public final class FastOutSlowInInterpolator implements Interpolator {
    private final Interpolator delegate = new PathInterpolator(0.4f, 0.0f, 0.2f, 1.0f);
    @Override public float getInterpolation(float input) { return delegate.getInterpolation(input); }
}
