/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.fernice.reflare.internal;

import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;

public interface DefaultLookupDelegate {

    Object getDefault(JComponent jComponent, ComponentUI componentUI, String s);
}
