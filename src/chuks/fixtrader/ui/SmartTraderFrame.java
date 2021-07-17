/****************************************************************************
** Copyright (c) 2001-2014
**
** This file is part of the QuickFIX FIX Engine
**
** This file may be distributed under the terms of the quickfixengine.org
** license as defined by quickfixengine.org and appearing in the file
** LICENSE included in the packaging of this file.
**
** This file is provided AS IS with NO WARRANTY OF ANY KIND, INCLUDING THE
** WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE.
**
** See http://www.quickfixengine.org/LICENSE for licensing information.
**
** Contact ask@quickfixengine.org if any conditions of this licensing are
** not clear to you.
**
****************************************************************************/

package chuks.fixtrader.ui;

import org.apache.log4j.Category;

import chuks.fixtrader.OrderTableModel;
import chuks.fixtrader.ExecutionTableModel;
import chuks.fixtrader.SmartTraderApplication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *  Main application window
 */
public class SmartTraderFrame extends JFrame {

    /** enable logging for this class */
    private static Category log = Category.getInstance
                                  (SmartTraderFrame.class.getName());

    public SmartTraderFrame(OrderTableModel orderTableModel,
                       ExecutionTableModel executionTableModel,
                       SmartTraderApplication application) {
        super();
        setTitle("Banzai!");
        setSize(600, 400);
        getContentPane().add(new SmartTraderPanel(orderTableModel,
                                             executionTableModel,
                                             application),
                             BorderLayout.CENTER);
        setVisible(true);
    }
}
