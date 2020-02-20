/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package org.fernice.reflare.internal;

import java.awt.Font;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class SunFontHelper extends Helper {

    private static final SunFontAccessor accessor = accessor(SunFontAccessor.class);

    @Nullable
    public static Font findFont(@NotNull String name, int weight, boolean italic) {
        return accessor.findFont(name, weight, italic);
    }

    public static boolean registerFontExtension(@NotNull Font font, boolean override) {
        return accessor.registerFontExtension(font, override);
    }

    public static boolean unregisterFontExtension(@NotNull Font font) {
        return accessor.unregisterFontExtension(font);
    }

    public static void refresh() {
        accessor.refresh();
    }

    public interface SunFontAccessor {

        @Nullable
        Font findFont(@NotNull String name, int weight, boolean italic);

        boolean registerFontExtension(@NotNull Font font, boolean override);

        boolean unregisterFontExtension(@NotNull Font font);

        void refresh();
    }
}
