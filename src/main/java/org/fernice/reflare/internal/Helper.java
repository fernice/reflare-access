/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.fernice.reflare.internal;

class Helper {

    @SuppressWarnings("unchecked")
    static <T> T accessor(Class<T> type) {
        try {
            Class<T> impl = (Class<T>) Class.forName(type.getPackage().getName() + ".impl." + type.getSimpleName() + "Impl");

            return impl.newInstance();
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException("no reflare access implementation is present in classpath", e);
        } catch (IllegalAccessException | InstantiationException e) {
            throw new IllegalStateException("reflare access implementation is corrupted", e);
        }
    }

}
