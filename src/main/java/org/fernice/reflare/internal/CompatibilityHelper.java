/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package org.fernice.reflare.internal;

public final class CompatibilityHelper extends Helper {

    private static final CompatibilityAccessor accessor = accessor(CompatibilityAccessor.class);

    public static void ensureCompatibility() {
        accessor.ensureCompatibility();
    }

    public interface CompatibilityAccessor {

        void ensureCompatibility();
    }

    private CompatibilityHelper() {
    }
}
