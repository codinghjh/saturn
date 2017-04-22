package com.qunar.fresh.table;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

/**
 * Created by junhuahan on 16-8-4. junhua.han@qunar.com
 */
public class TableDemo {
    public static void main(String[] args) {
        Table<Integer, Integer, String> table = HashBasedTable.create();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                table.put(i, j, String.valueOf(i * 10 + j));
            }
        }

        System.out.println(table.column(2));
        System.out.println(table.row(3));
        System.out.println(table.columnMap());
        System.out.println(table.rowMap());
        System.out.println(table.get(4, 0));
    }
}
