/*
Copyright 2015 Google Inc. All Rights Reserved.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package com.google.security.zynamics.binnavi.Gui.GraphWindows.Actions;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import com.google.common.base.Preconditions;
import com.google.security.zynamics.binnavi.Gui.HotKeys;
import com.google.security.zynamics.binnavi.Gui.GraphWindows.IViewSwitcher;


/**
 * Action class for switching the graph window to the standard perspective.
 */
public final class CSwitchToStandardView extends AbstractAction {
  /**
   * Used for serialization.
   */
  private static final long serialVersionUID = -4588327641723177601L;

  /**
   * Switches perspectives.
   */
  private final IViewSwitcher m_viewSwitcher;

  /**
   * Creates a new action object.
   * 
   * @param viewSwitcher Switches perspectives.
   */
  public CSwitchToStandardView(final IViewSwitcher viewSwitcher) {
    super("Standard Perspective");
    m_viewSwitcher =
        Preconditions.checkNotNull(viewSwitcher, "IE02840: viewSwitcher argument can not be null");
    putValue(ACCELERATOR_KEY, HotKeys.GRAPH_SWITCH_TO_STANDARD_PERSPECTIVE_HK.getKeyStroke());
  }

  @Override
  public void actionPerformed(final ActionEvent event) {
    m_viewSwitcher.activateStandardView();
  }
}
