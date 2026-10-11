/*
 * Copyright 2026 The Android Open Source Project
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

package androidx.fragment.app;

import android.os.Trace;

/**
 * Traces fragment lifecycle operations using the Android platform trace API.
 * This Android-only implementation avoids a dependency on the upstream
 * multiplatform tracing runtime.
 */
@androidx.annotation.MainThread
final class FragmentTracer {
    private final Fragment fragment;

    FragmentTracer(Fragment fragment) {
        this.fragment = fragment;
    }

    void trace(String name, Runnable block) {
        String label = name == null ? "Fragment" : name;
        if (label.length() > 127) {
            label = label.substring(0, 127);
        }
        label = label.replace('|', ' ').replace('\n', ' ').replace('\0', ' ');
        Trace.beginSection(label);
        try {
            block.run();
        } finally {
            Trace.endSection();
        }
    }
}
