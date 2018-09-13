/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.fernice.reflare.internal;

import java.awt.FontMetrics;
import java.awt.Graphics;
import javax.swing.JComponent;

public final class SwingUtilitiesHelper extends Helper {

    private static final SwingUtilitiesAccessor accessor = accessor(SwingUtilitiesAccessor.class);

    public static FontMetrics getFontMetrics(JComponent var0, Graphics var1) {
        return accessor.getFontMetrics(var0, var1);
    }

    public static void drawStringUnderlineCharAt(JComponent var0, Graphics var1, String var2, int var3, int var4, int var5) {
        accessor.drawStringUnderlineCharAt(var0, var1, var2, var3, var4, var5);
    }

    public interface SwingUtilitiesAccessor {

        FontMetrics getFontMetrics(JComponent var0, Graphics var1);

        void drawStringUnderlineCharAt(JComponent var0, Graphics var1, String var2, int var3, int var4, int var5);
    }
}
