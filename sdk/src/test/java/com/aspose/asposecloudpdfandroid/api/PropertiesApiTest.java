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
import com.aspose.asposecloudpdfandroid.model.DocumentPropertiesResponse;
import com.aspose.asposecloudpdfandroid.model.DocumentPropertyResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PropertiesApi
 */
@Ignore
public class PropertiesApiTest {

    private final PropertiesApi api = new PropertiesApi();

    
    /**
     * Delete custom document properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePropertiesTest() throws ApiException {
        String name = null;
        String storage = null;
        String folder = null;
        String password = null;
        AsposeResponse response = api.deleteProperties(name, storage, folder, password);

        // TODO: test validations
    }
    
    /**
     * Delete document property.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePropertyTest() throws ApiException {
        String name = null;
        String propertyName = null;
        String storage = null;
        String folder = null;
        String password = null;
        AsposeResponse response = api.deleteProperty(name, propertyName, storage, folder, password);

        // TODO: test validations
    }
    
    /**
     * Read document properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDocumentPropertiesTest() throws ApiException {
        String name = null;
        String storage = null;
        String folder = null;
        String password = null;
        DocumentPropertiesResponse response = api.getDocumentProperties(name, storage, folder, password);

        // TODO: test validations
    }
    
    /**
     * Read document property by name.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDocumentPropertyTest() throws ApiException {
        String name = null;
        String propertyName = null;
        String storage = null;
        String folder = null;
        String password = null;
        DocumentPropertyResponse response = api.getDocumentProperty(name, propertyName, storage, folder, password);

        // TODO: test validations
    }
    
    /**
     * Add/update document property.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSetPropertyTest() throws ApiException {
        String name = null;
        String propertyName = null;
        String value = null;
        String storage = null;
        String folder = null;
        String password = null;
        DocumentPropertyResponse response = api.putSetProperty(name, propertyName, value, storage, folder, password);

        // TODO: test validations
    }
    
}
