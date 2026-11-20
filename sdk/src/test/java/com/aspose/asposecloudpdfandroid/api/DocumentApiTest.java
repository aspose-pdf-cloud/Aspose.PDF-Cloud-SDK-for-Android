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
import com.aspose.asposecloudpdfandroid.model.DocumentConfig;
import com.aspose.asposecloudpdfandroid.model.DocumentPrivilege;
import com.aspose.asposecloudpdfandroid.model.DocumentResponse;
import com.aspose.asposecloudpdfandroid.model.OptimizeOptions;
import com.aspose.asposecloudpdfandroid.model.Rectangle;
import com.aspose.asposecloudpdfandroid.model.Signature;
import com.aspose.asposecloudpdfandroid.model.SignatureVerifyResponse;
import com.aspose.asposecloudpdfandroid.model.SplitRangePdfOptions;
import com.aspose.asposecloudpdfandroid.model.SplitResultResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DocumentApi
 */
@Ignore
public class DocumentApiTest {

    private final DocumentApi api = new DocumentApi();

    
    /**
     * Read common document info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDocumentTest() throws ApiException {
        String name = null;
        String storage = null;
        String folder = null;
        String password = null;
        DocumentResponse response = api.getDocument(name, storage, folder, password);

        // TODO: test validations
    }
    
    /**
     * Verify signature document.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getVerifySignatureTest() throws ApiException {
        String name = null;
        String signName = null;
        String storage = null;
        String folder = null;
        SignatureVerifyResponse response = api.getVerifySignature(name, signName, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Create empty document.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postCreateDocumentTest() throws ApiException {
        String name = null;
        DocumentConfig documentConfig = null;
        String storage = null;
        String folder = null;
        DocumentResponse response = api.postCreateDocument(name, documentConfig, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Crop PDF document pages.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postDocumentPagesCropTest() throws ApiException {
        String name = null;
        String pages = null;
        Rectangle rect = null;
        String storage = null;
        String folder = null;
        String password = null;
        AsposeResponse response = api.postDocumentPagesCrop(name, pages, rect, storage, folder, password);

        // TODO: test validations
    }
    
    /**
     * Rsize PDF document.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postDocumentPagesResizeTest() throws ApiException {
        String name = null;
        Double height = null;
        Double width = null;
        String pages = null;
        String storage = null;
        String folder = null;
        String password = null;
        AsposeResponse response = api.postDocumentPagesResize(name, height, width, pages, storage, folder, password);

        // TODO: test validations
    }
    
    /**
     * Rotate PDF document.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postDocumentPagesRotateTest() throws ApiException {
        String name = null;
        String rotationAngle = null;
        String pages = null;
        String storage = null;
        String folder = null;
        String password = null;
        AsposeResponse response = api.postDocumentPagesRotate(name, rotationAngle, pages, storage, folder, password);

        // TODO: test validations
    }
    
    /**
     * Flatten the document.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postFlattenDocumentTest() throws ApiException {
        String name = null;
        Boolean updateAppearances = null;
        Boolean callEvents = null;
        Boolean hideButtons = null;
        String storage = null;
        String folder = null;
        AsposeResponse response = api.postFlattenDocument(name, updateAppearances, callEvents, hideButtons, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Optimize document.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postOptimizeDocumentTest() throws ApiException {
        String name = null;
        OptimizeOptions options = null;
        String storage = null;
        String folder = null;
        AsposeResponse response = api.postOptimizeDocument(name, options, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Sign document.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSignDocumentTest() throws ApiException {
        String name = null;
        Signature sign = null;
        String storage = null;
        String folder = null;
        AsposeResponse response = api.postSignDocument(name, sign, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Split document to parts.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSplitDocumentTest() throws ApiException {
        String name = null;
        String format = null;
        Integer from = null;
        Integer to = null;
        String storage = null;
        String folder = null;
        String password = null;
        SplitResultResponse response = api.postSplitDocument(name, format, from, to, storage, folder, password);

        // TODO: test validations
    }
    
    /**
     * Split document into ranges.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSplitRangePdfDocumentTest() throws ApiException {
        String name = null;
        SplitRangePdfOptions options = null;
        String storage = null;
        String folder = null;
        String password = null;
        SplitResultResponse response = api.postSplitRangePdfDocument(name, options, storage, folder, password);

        // TODO: test validations
    }
    
    /**
     * Create empty document.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putCreateDocumentTest() throws ApiException {
        String name = null;
        String storage = null;
        String folder = null;
        DocumentResponse response = api.putCreateDocument(name, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Update privilege document.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putPrivilegesTest() throws ApiException {
        String name = null;
        DocumentPrivilege privileges = null;
        String storage = null;
        String folder = null;
        AsposeResponse response = api.putPrivileges(name, privileges, storage, folder);

        // TODO: test validations
    }
    
}
