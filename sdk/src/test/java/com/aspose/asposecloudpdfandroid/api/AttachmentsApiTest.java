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
import com.aspose.asposecloudpdfandroid.model.AttachmentInfo;
import com.aspose.asposecloudpdfandroid.model.AttachmentResponse;
import com.aspose.asposecloudpdfandroid.model.AttachmentsResponse;
import java.io.File;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AttachmentsApi
 */
@Ignore
public class AttachmentsApiTest {

    private final AttachmentsApi api = new AttachmentsApi();

    
    /**
     * Read document attachment info by its index.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDocumentAttachmentByIndexTest() throws ApiException {
        String name = null;
        Integer attachmentIndex = null;
        String storage = null;
        String folder = null;
        AttachmentResponse response = api.getDocumentAttachmentByIndex(name, attachmentIndex, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document attachments info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDocumentAttachmentsTest() throws ApiException {
        String name = null;
        String storage = null;
        String folder = null;
        AttachmentsResponse response = api.getDocumentAttachments(name, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Download document attachment content by its index.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDownloadDocumentAttachmentByIndexTest() throws ApiException {
        String name = null;
        Integer attachmentIndex = null;
        String storage = null;
        String folder = null;
        File response = api.getDownloadDocumentAttachmentByIndex(name, attachmentIndex, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Adds a file attachment to the PDF document.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAddDocumentAttachmentTest() throws ApiException {
        String name = null;
        AttachmentInfo attachmentInfo = null;
        String storage = null;
        String folder = null;
        AttachmentsResponse response = api.postAddDocumentAttachment(name, attachmentInfo, storage, folder);

        // TODO: test validations
    }
    
}
