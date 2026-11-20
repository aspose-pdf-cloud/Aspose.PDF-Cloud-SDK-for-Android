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
import com.aspose.asposecloudpdfandroid.model.DocumentLayers;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LayerApi
 */
@Ignore
public class LayerApiTest {

    private final LayerApi api = new LayerApi();

    
    /**
     * Remove document layer.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteDocumentLayerTest() throws ApiException {
        String name = null;
        Integer pageNumber = null;
        String layerId = null;
        String folder = null;
        String storage = null;
        String passBase64 = null;
        AsposeResponse response = api.deleteDocumentLayer(name, pageNumber, layerId, folder, storage, passBase64);

        // TODO: test validations
    }
    
    /**
     * Gets document layers.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDocumentLayersTest() throws ApiException {
        String name = null;
        String folder = null;
        String storage = null;
        String passBase64 = null;
        DocumentLayers response = api.getDocumentLayers(name, folder, storage, passBase64);

        // TODO: test validations
    }
    
    /**
     * Create a separate PDF from a PDF Layer and upload resulting file to storage.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putCreatePdfFromLayerTest() throws ApiException {
        String name = null;
        Integer pageNumber = null;
        String outPath = null;
        String layerId = null;
        String folder = null;
        String storage = null;
        String passBase64 = null;
        AsposeResponse response = api.putCreatePdfFromLayer(name, pageNumber, outPath, layerId, folder, storage, passBase64);

        // TODO: test validations
    }
    
}
