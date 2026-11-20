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
import com.aspose.asposecloudpdfandroid.model.FilesList;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FolderApi
 */
@Ignore
public class FolderApiTest {

    private final FolderApi api = new FolderApi();

    
    /**
     * Copy folder
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void copyFolderTest() throws ApiException {
        String srcPath = null;
        String destPath = null;
        String srcStorageName = null;
        String destStorageName = null;
        api.copyFolder(srcPath, destPath, srcStorageName, destStorageName);

        // TODO: test validations
    }
    
    /**
     * Create the folder
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createFolderTest() throws ApiException {
        String path = null;
        String storageName = null;
        api.createFolder(path, storageName);

        // TODO: test validations
    }
    
    /**
     * Delete folder
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteFolderTest() throws ApiException {
        String path = null;
        String storageName = null;
        Boolean recursive = null;
        api.deleteFolder(path, storageName, recursive);

        // TODO: test validations
    }
    
    /**
     * Get all files and folders within a folder
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFilesListTest() throws ApiException {
        String path = null;
        String storageName = null;
        FilesList response = api.getFilesList(path, storageName);

        // TODO: test validations
    }
    
    /**
     * Move folder
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void moveFolderTest() throws ApiException {
        String srcPath = null;
        String destPath = null;
        String srcStorageName = null;
        String destStorageName = null;
        api.moveFolder(srcPath, destPath, srcStorageName, destStorageName);

        // TODO: test validations
    }
    
}
