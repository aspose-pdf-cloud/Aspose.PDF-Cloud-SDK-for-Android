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
import java.io.File;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FormDataApi
 */
@Ignore
public class FormDataApiTest {

    private final FormDataApi api = new FormDataApi();

    
    /**
     * Export fields from from PDF in storage to FDF file.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getExportFieldsFromPdfToFdfInStorageTest() throws ApiException {
        String name = null;
        String storage = null;
        String folder = null;
        File response = api.getExportFieldsFromPdfToFdfInStorage(name, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Export fields from from PDF in storage to XFDF file.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getExportFieldsFromPdfToXfdfInStorageTest() throws ApiException {
        String name = null;
        String storage = null;
        String folder = null;
        File response = api.getExportFieldsFromPdfToXfdfInStorage(name, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Export fields from from PDF in storage to XML file.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getExportFieldsFromPdfToXmlInStorageTest() throws ApiException {
        String name = null;
        String storage = null;
        String folder = null;
        File response = api.getExportFieldsFromPdfToXmlInStorage(name, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Update fields from FDF file in storage.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getImportFieldsFromFdfInStorageTest() throws ApiException {
        String name = null;
        String fdfFilePath = null;
        String storage = null;
        String folder = null;
        File response = api.getImportFieldsFromFdfInStorage(name, fdfFilePath, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Update fields from XFDF file in storage.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getImportFieldsFromXfdfInStorageTest() throws ApiException {
        String name = null;
        String xfdfFilePath = null;
        String storage = null;
        String folder = null;
        File response = api.getImportFieldsFromXfdfInStorage(name, xfdfFilePath, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Import from XML file (located on storage) to PDF format and return resulting file in response.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getImportFieldsFromXmlInStorageTest() throws ApiException {
        String name = null;
        String xmlFilePath = null;
        String storage = null;
        String folder = null;
        File response = api.getImportFieldsFromXmlInStorage(name, xmlFilePath, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Update fields from FDF file in request.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postImportFieldsFromFdfTest() throws ApiException {
        String name = null;
        String storage = null;
        String folder = null;
        File fdfData = null;
        AsposeResponse response = api.postImportFieldsFromFdf(name, storage, folder, fdfData);

        // TODO: test validations
    }
    
    /**
     * Update fields from XFDF file in request.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postImportFieldsFromXfdfTest() throws ApiException {
        String name = null;
        String storage = null;
        String folder = null;
        File xfdfData = null;
        AsposeResponse response = api.postImportFieldsFromXfdf(name, storage, folder, xfdfData);

        // TODO: test validations
    }
    
    /**
     * Update fields from XML file in request.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postImportFieldsFromXmlTest() throws ApiException {
        String name = null;
        String storage = null;
        String folder = null;
        File xmlData = null;
        AsposeResponse response = api.postImportFieldsFromXml(name, storage, folder, xmlData);

        // TODO: test validations
    }
    
    /**
     * Export fields from from PDF in storage to FDF file in storage.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putExportFieldsFromPdfToFdfInStorageTest() throws ApiException {
        String name = null;
        String fdfOutputFilePath = null;
        String storage = null;
        String folder = null;
        AsposeResponse response = api.putExportFieldsFromPdfToFdfInStorage(name, fdfOutputFilePath, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Export fields from from PDF in storage to XFDF file in storage.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putExportFieldsFromPdfToXfdfInStorageTest() throws ApiException {
        String name = null;
        String xfdfOutputFilePath = null;
        String storage = null;
        String folder = null;
        AsposeResponse response = api.putExportFieldsFromPdfToXfdfInStorage(name, xfdfOutputFilePath, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Export fields from from PDF in storage to XML file in storage.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putExportFieldsFromPdfToXmlInStorageTest() throws ApiException {
        String name = null;
        String xmlOutputFilePath = null;
        String storage = null;
        String folder = null;
        AsposeResponse response = api.putExportFieldsFromPdfToXmlInStorage(name, xmlOutputFilePath, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Update fields from FDF file in storage.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putImportFieldsFromFdfInStorageTest() throws ApiException {
        String name = null;
        String fdfFilePath = null;
        String storage = null;
        String folder = null;
        AsposeResponse response = api.putImportFieldsFromFdfInStorage(name, fdfFilePath, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Update fields from XFDF file in storage.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putImportFieldsFromXfdfInStorageTest() throws ApiException {
        String name = null;
        String xfdfFilePath = null;
        String storage = null;
        String folder = null;
        AsposeResponse response = api.putImportFieldsFromXfdfInStorage(name, xfdfFilePath, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Update fields from XML file in storage.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putImportFieldsFromXmlInStorageTest() throws ApiException {
        String name = null;
        String xmlFilePath = null;
        String storage = null;
        String folder = null;
        AsposeResponse response = api.putImportFieldsFromXmlInStorage(name, xmlFilePath, storage, folder);

        // TODO: test validations
    }
    
}
