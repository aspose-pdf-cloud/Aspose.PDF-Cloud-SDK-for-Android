/**
 *
 * Copyright (c) 2026 Aspose.PDF Cloud
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */


package com.aspose.asposecloudpdfandroid.api;

import com.aspose.asposecloudpdfandroid.ApiException;
import com.aspose.asposecloudpdfandroid.model.AsposeResponse;
import com.aspose.asposecloudpdfandroid.model.Table;
import com.aspose.asposecloudpdfandroid.model.TableRecognizedResponse;
import com.aspose.asposecloudpdfandroid.model.TablesRecognizedResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TableApi
 */
@Ignore
public class TableApiTest {

    private final TableApi api = new TableApi();

    
    /**
     * Delete all tables from the document
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteDocumentTablesTest() throws ApiException {
        String name = null;
        String storage = null;
        String folder = null;
        AsposeResponse response = api.deleteDocumentTables(name, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Delete all tables from the page
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePageTablesTest() throws ApiException {
        String name = null;
        Integer pageNumber = null;
        String storage = null;
        String folder = null;
        AsposeResponse response = api.deletePageTables(name, pageNumber, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Delete document table by ID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteTableTest() throws ApiException {
        String name = null;
        String tableId = null;
        String storage = null;
        String folder = null;
        AsposeResponse response = api.deleteTable(name, tableId, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document tables.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDocumentTablesTest() throws ApiException {
        String name = null;
        String storage = null;
        String folder = null;
        TablesRecognizedResponse response = api.getDocumentTables(name, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document page tables.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPageTablesTest() throws ApiException {
        String name = null;
        Integer pageNumber = null;
        String storage = null;
        String folder = null;
        TablesRecognizedResponse response = api.getPageTables(name, pageNumber, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document page table by ID.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTableTest() throws ApiException {
        String name = null;
        String tableId = null;
        String storage = null;
        String folder = null;
        TableRecognizedResponse response = api.getTable(name, tableId, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Add document page tables.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postPageTablesTest() throws ApiException {
        String name = null;
        Integer pageNumber = null;
        List<Table> tables = null;
        String storage = null;
        String folder = null;
        AsposeResponse response = api.postPageTables(name, pageNumber, tables, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Replace document page table.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putTableTest() throws ApiException {
        String name = null;
        String tableId = null;
        Table table = null;
        String storage = null;
        String folder = null;
        AsposeResponse response = api.putTable(name, tableId, table, storage, folder);

        // TODO: test validations
    }
    
}
