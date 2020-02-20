/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package org.fernice.reflare.internal;

import javax.swing.PopupFactory;
import org.jetbrains.annotations.NotNull;

public class PopupFactoryHelper extends Helper {

    private static final PopupFactoryAccessor accessor = accessor(PopupFactoryAccessor.class);

    @NotNull
    public static PopupFactory createScreenPopupFactory() {
        return accessor.createScreenPopupFactory();
    }

    public interface PopupFactoryAccessor {

        @NotNull
        PopupFactory createScreenPopupFactory();
    }
}
