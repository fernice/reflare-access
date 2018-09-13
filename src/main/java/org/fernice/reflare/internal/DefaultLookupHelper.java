/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.fernice.reflare.internal;

public class DefaultLookupHelper extends Helper {

    private static final DefaultLookupAccessor accessor = accessor(DefaultLookupAccessor.class);

    public static void setDefaultLookup(DefaultLookup defaultLookup) {
        accessor.setDefaultLookup(defaultLookup);
    }

    public interface DefaultLookupAccessor {

        void setDefaultLookup(DefaultLookup delegate);
    }
}
