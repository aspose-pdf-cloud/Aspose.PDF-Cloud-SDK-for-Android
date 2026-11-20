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
import com.aspose.asposecloudpdfandroid.model.DisplayProperties;
import com.aspose.asposecloudpdfandroid.model.DisplayPropertiesResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DisplayPropertiesApi
 */
@Ignore
public class DisplayPropertiesApiTest {

    private final DisplayPropertiesApi api = new DisplayPropertiesApi();

    
    /**
     * Read document display properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDocumentDisplayPropertiesTest() throws ApiException {
        String name = null;
        String storage = null;
        String folder = null;
        DisplayPropertiesResponse response = api.getDocumentDisplayProperties(name, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Update document display properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putDocumentDisplayPropertiesTest() throws ApiException {
        String name = null;
        DisplayProperties displayProperties = null;
        String storage = null;
        String folder = null;
        DisplayPropertiesResponse response = api.putDocumentDisplayProperties(name, displayProperties, storage, folder);

        // TODO: test validations
    }
    
}
