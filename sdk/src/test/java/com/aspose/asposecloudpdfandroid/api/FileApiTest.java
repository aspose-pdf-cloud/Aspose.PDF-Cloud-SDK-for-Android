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
import java.io.File;
import com.aspose.asposecloudpdfandroid.model.FilesUploadResult;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FileApi
 */
@Ignore
public class FileApiTest {

    private final FileApi api = new FileApi();

    
    /**
     * Copy file
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void copyFileTest() throws ApiException {
        String srcPath = null;
        String destPath = null;
        String srcStorageName = null;
        String destStorageName = null;
        String versionId = null;
        api.copyFile(srcPath, destPath, srcStorageName, destStorageName, versionId);

        // TODO: test validations
    }
    
    /**
     * Delete file
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteFileTest() throws ApiException {
        String path = null;
        String storageName = null;
        String versionId = null;
        api.deleteFile(path, storageName, versionId);

        // TODO: test validations
    }
    
    /**
     * Download file
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void downloadFileTest() throws ApiException {
        String path = null;
        String storageName = null;
        String versionId = null;
        File response = api.downloadFile(path, storageName, versionId);

        // TODO: test validations
    }
    
    /**
     * Move file
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void moveFileTest() throws ApiException {
        String srcPath = null;
        String destPath = null;
        String srcStorageName = null;
        String destStorageName = null;
        String versionId = null;
        api.moveFile(srcPath, destPath, srcStorageName, destStorageName, versionId);

        // TODO: test validations
    }
    
    /**
     * Upload file
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void uploadFileTest() throws ApiException {
        String path = null;
        File file = null;
        String storageName = null;
        FilesUploadResult response = api.uploadFile(path, file, storageName);

        // TODO: test validations
    }
    
}
