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
import chuks.fixtrader.SmartTraderApplication;
import javax.swing.*;
import javax.swing.table.TableModel;
import java.awt.*;
import java.util.ArrayList;

/**
 *  Contains the Order table.
 */
public class OrderPanel extends JPanel {

    private static Category log =
        Category.getInstance(OrderPanel.class.getName());

    private JTable orderTable = null;

    public OrderPanel(OrderTableModel orderTableModel,
                      SmartTraderApplication application) {
        setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.BOTH;
        constraints.weightx = 1;
        constraints.weighty = 1;

        orderTable = new OrderTable(orderTableModel, application);
        add(new JScrollPane(orderTable), constraints);
    }

    public JTable orderTable() {
        return orderTable;
    }
}
