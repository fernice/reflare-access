/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.fernice.reflare.internal;

import java.util.Map;

public final class AATextInfoHelper extends Helper {

    private static final AATextInfoAccessor accessor = accessor(AATextInfoAccessor.class);

    public static void aaTextInfo(Map<Object, Object> defaults) {
        accessor.aaTextInfo(defaults);
    }

    public interface AATextInfoAccessor {

        void aaTextInfo(Map<Object, Object> defaults);
    }
}
