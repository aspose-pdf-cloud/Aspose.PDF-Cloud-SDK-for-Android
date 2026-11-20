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
import com.aspose.asposecloudpdfandroid.model.ImageTemplatesRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ConvertApi
 */
@Ignore
public class ConvertApiTest {

    private final ConvertApi api = new ConvertApi();

    
    /**
     * Convert APS file (located on storage) to PDF format and return resulting file in response.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getApsInStorageToPdfTest() throws ApiException {
        String srcPath = null;
        String storage = null;
        File response = api.getApsInStorageToPdf(srcPath, storage);

        // TODO: test validations
    }
    
    /**
     * Convert EPUB file (located on storage) to PDF format and return resulting file in response.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEpubInStorageToPdfTest() throws ApiException {
        String srcPath = null;
        String storage = null;
        File response = api.getEpubInStorageToPdf(srcPath, storage);

        // TODO: test validations
    }
    
    /**
     * Convert HTML file (located on storage) to PDF format and return resulting file in response.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getHtmlInStorageToPdfTest() throws ApiException {
        String srcPath = null;
        String htmlFileName = null;
        Double height = null;
        Double width = null;
        Boolean isLandscape = null;
        Double marginLeft = null;
        Double marginBottom = null;
        Double marginRight = null;
        Double marginTop = null;
        String storage = null;
        File response = api.getHtmlInStorageToPdf(srcPath, htmlFileName, height, width, isLandscape, marginLeft, marginBottom, marginRight, marginTop, storage);

        // TODO: test validations
    }
    
    /**
     * Convert MD file (located on storage) to PDF format and return resulting file in response.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMarkdownInStorageToPdfTest() throws ApiException {
        String srcPath = null;
        String storage = null;
        File response = api.getMarkdownInStorageToPdf(srcPath, storage);

        // TODO: test validations
    }
    
    /**
     * Convert MHT file (located on storage) to PDF format and return resulting file in response.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMhtInStorageToPdfTest() throws ApiException {
        String srcPath = null;
        Double height = null;
        Double width = null;
        Double marginLeft = null;
        Double marginBottom = null;
        Double marginRight = null;
        Double marginTop = null;
        String storage = null;
        File response = api.getMhtInStorageToPdf(srcPath, height, width, marginLeft, marginBottom, marginRight, marginTop, storage);

        // TODO: test validations
    }
    
    /**
     * Convert PCL file (located on storage) to PDF format and return resulting file in response.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPclInStorageToPdfTest() throws ApiException {
        String srcPath = null;
        String storage = null;
        File response = api.getPclInStorageToPdf(srcPath, storage);

        // TODO: test validations
    }
    
    /**
     * Convert PDFA file (located on storage) to PDF format and return resulting file in response.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPdfAInStorageToPdfTest() throws ApiException {
        String srcPath = null;
        Boolean dontOptimize = null;
        String storage = null;
        File response = api.getPdfAInStorageToPdf(srcPath, dontOptimize, storage);

        // TODO: test validations
    }
    
    /**
     * Converts PDF document (located on storage) to APS format and returns resulting file in response content
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPdfInStorageToApsTest() throws ApiException {
        String name = null;
        String folder = null;
        String storage = null;
        File response = api.getPdfInStorageToAps(name, folder, storage);

        // TODO: test validations
    }
    
    /**
     * Converts PDF document (located on storage) to DOC format and returns resulting file in response content.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPdfInStorageToDocTest() throws ApiException {
        String name = null;
        Boolean addReturnToLineEnd = null;
        String format = null;
        Integer imageResolutionX = null;
        Integer imageResolutionY = null;
        Double maxDistanceBetweenTextLines = null;
        String mode = null;
        Boolean recognizeBullets = null;
        Double relativeHorizontalProximity = null;
        String folder = null;
        String storage = null;
        String password = null;
        File response = api.getPdfInStorageToDoc(name, addReturnToLineEnd, format, imageResolutionX, imageResolutionY, maxDistanceBetweenTextLines, mode, recognizeBullets, relativeHorizontalProximity, folder, storage, password);

        // TODO: test validations
    }
    
    /**
     * Converts PDF document (located on storage) to EPUB format and returns resulting file in response content
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPdfInStorageToEpubTest() throws ApiException {
        String name = null;
        String contentRecognitionMode = null;
        String folder = null;
        String storage = null;
        File response = api.getPdfInStorageToEpub(name, contentRecognitionMode, folder, storage);

        // TODO: test validations
    }
    
    /**
     * Converts PDF document (located on storage) to Html format and returns resulting file in response content
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPdfInStorageToHtmlTest() throws ApiException {
        String name = null;
        Integer additionalMarginWidthInPoints = null;
        Boolean compressSvgGraphicsIfAny = null;
        Boolean convertMarkedContentToLayers = null;
        String defaultFontName = null;
        String documentType = null;
        Boolean fixedLayout = null;
        Integer imageResolution = null;
        Integer minimalLineWidth = null;
        Boolean preventGlyphsGrouping = null;
        Boolean splitCssIntoPages = null;
        Boolean splitIntoPages = null;
        Boolean useZOrder = null;
        String antialiasingProcessing = null;
        String cssClassNamesPrefix = null;
        List<Integer> explicitListOfSavedPages = null;
        String fontEncodingStrategy = null;
        String fontSavingMode = null;
        String htmlMarkupGenerationMode = null;
        String lettersPositioningMethod = null;
        Boolean pagesFlowTypeDependsOnViewersScreenSize = null;
        String partsEmbeddingMode = null;
        String rasterImagesSavingMode = null;
        Boolean removeEmptyAreasOnTopAndBottom = null;
        Boolean saveShadowedTextsAsTransparentTexts = null;
        Boolean saveTransparentTexts = null;
        String specialFolderForAllImages = null;
        String specialFolderForSvgImages = null;
        Boolean trySaveTextUnderliningAndStrikeoutingInCss = null;
        String folder = null;
        String storage = null;
        Boolean flowLayoutParagraphFullWidth = null;
        File response = api.getPdfInStorageToHtml(name, additionalMarginWidthInPoints, compressSvgGraphicsIfAny, convertMarkedContentToLayers, defaultFontName, documentType, fixedLayout, imageResolution, minimalLineWidth, preventGlyphsGrouping, splitCssIntoPages, splitIntoPages, useZOrder, antialiasingProcessing, cssClassNamesPrefix, explicitListOfSavedPages, fontEncodingStrategy, fontSavingMode, htmlMarkupGenerationMode, lettersPositioningMethod, pagesFlowTypeDependsOnViewersScreenSize, partsEmbeddingMode, rasterImagesSavingMode, removeEmptyAreasOnTopAndBottom, saveShadowedTextsAsTransparentTexts, saveTransparentTexts, specialFolderForAllImages, specialFolderForSvgImages, trySaveTextUnderliningAndStrikeoutingInCss, folder, storage, flowLayoutParagraphFullWidth);

        // TODO: test validations
    }
    
    /**
     * Converts PDF document (located on storage) to MOBIXML format and returns resulting ZIP archive file in response content.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPdfInStorageToMobiXmlTest() throws ApiException {
        String name = null;
        String folder = null;
        String storage = null;
        File response = api.getPdfInStorageToMobiXml(name, folder, storage);

        // TODO: test validations
    }
    
    /**
     * Converts PDF document (located on storage) to PdfA format and returns resulting file in response content
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPdfInStorageToPdfATest() throws ApiException {
        String name = null;
        String type = null;
        String folder = null;
        String storage = null;
        String password = null;
        File response = api.getPdfInStorageToPdfA(name, type, folder, storage, password);

        // TODO: test validations
    }
    
    /**
     * Converts PDF document (located on storage) to PPTX format and returns resulting file in response content
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPdfInStorageToPptxTest() throws ApiException {
        String name = null;
        Boolean separateImages = null;
        Boolean slidesAsImages = null;
        String folder = null;
        String storage = null;
        String password = null;
        File response = api.getPdfInStorageToPptx(name, separateImages, slidesAsImages, folder, storage, password);

        // TODO: test validations
    }
    
    /**
     * Converts PDF document (located on storage) to SVG format and returns resulting file in response content
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPdfInStorageToSvgTest() throws ApiException {
        String name = null;
        Boolean compressOutputToZipArchive = null;
        String folder = null;
        String storage = null;
        String password = null;
        File response = api.getPdfInStorageToSvg(name, compressOutputToZipArchive, folder, storage, password);

        // TODO: test validations
    }
    
    /**
     * Converts PDF document (located on storage) to TeX format and returns resulting file in response content
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPdfInStorageToTeXTest() throws ApiException {
        String name = null;
        String folder = null;
        String storage = null;
        File response = api.getPdfInStorageToTeX(name, folder, storage);

        // TODO: test validations
    }
    
    /**
     * Converts PDF document (located on storage) to Text format and returns resulting file in response content
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPdfInStorageToTextTest() throws ApiException {
        String name = null;
        String folder = null;
        String storage = null;
        File response = api.getPdfInStorageToText(name, folder, storage);

        // TODO: test validations
    }
    
    /**
     * Converts PDF document (located on storage) to TIFF format and returns resulting file in response content
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPdfInStorageToTiffTest() throws ApiException {
        String name = null;
        Double brightness = null;
        String compression = null;
        String colorDepth = null;
        Integer leftMargin = null;
        Integer rightMargin = null;
        Integer topMargin = null;
        Integer bottomMargin = null;
        String orientation = null;
        Boolean skipBlankPages = null;
        Integer width = null;
        Integer height = null;
        Integer xResolution = null;
        Integer yResolution = null;
        Integer pageIndex = null;
        Integer pageCount = null;
        String folder = null;
        String storage = null;
        File response = api.getPdfInStorageToTiff(name, brightness, compression, colorDepth, leftMargin, rightMargin, topMargin, bottomMargin, orientation, skipBlankPages, width, height, xResolution, yResolution, pageIndex, pageCount, folder, storage);

        // TODO: test validations
    }
    
    /**
     * Converts PDF document (located on storage) to XLS format and returns resulting file in response content
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPdfInStorageToXlsTest() throws ApiException {
        String name = null;
        Boolean insertBlankColumnAtFirst = null;
        Boolean minimizeTheNumberOfWorksheets = null;
        Double scaleFactor = null;
        Boolean uniformWorksheets = null;
        String folder = null;
        String storage = null;
        String password = null;
        File response = api.getPdfInStorageToXls(name, insertBlankColumnAtFirst, minimizeTheNumberOfWorksheets, scaleFactor, uniformWorksheets, folder, storage, password);

        // TODO: test validations
    }
    
    /**
     * Converts PDF document (located on storage) to XLSX format and returns resulting file in response content
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPdfInStorageToXlsxTest() throws ApiException {
        String name = null;
        Boolean insertBlankColumnAtFirst = null;
        Boolean minimizeTheNumberOfWorksheets = null;
        Double scaleFactor = null;
        Boolean uniformWorksheets = null;
        String folder = null;
        String storage = null;
        String password = null;
        File response = api.getPdfInStorageToXlsx(name, insertBlankColumnAtFirst, minimizeTheNumberOfWorksheets, scaleFactor, uniformWorksheets, folder, storage, password);

        // TODO: test validations
    }
    
    /**
     * Converts PDF document (located on storage) to XML format and returns resulting file in response content
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPdfInStorageToXmlTest() throws ApiException {
        String name = null;
        String folder = null;
        String storage = null;
        File response = api.getPdfInStorageToXml(name, folder, storage);

        // TODO: test validations
    }
    
    /**
     * Converts PDF document (located on storage) to XPS format and returns resulting file in response content
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPdfInStorageToXpsTest() throws ApiException {
        String name = null;
        String folder = null;
        String storage = null;
        File response = api.getPdfInStorageToXps(name, folder, storage);

        // TODO: test validations
    }
    
    /**
     * Convert PS file (located on storage) to PDF format and return resulting file in response.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPsInStorageToPdfTest() throws ApiException {
        String srcPath = null;
        String storage = null;
        File response = api.getPsInStorageToPdf(srcPath, storage);

        // TODO: test validations
    }
    
    /**
     * Convert SVG file (located on storage) to PDF format and return resulting file in response.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSvgInStorageToPdfTest() throws ApiException {
        String srcPath = null;
        Boolean adjustPageSize = null;
        Double height = null;
        Double width = null;
        Boolean isLandscape = null;
        Double marginLeft = null;
        Double marginBottom = null;
        Double marginRight = null;
        Double marginTop = null;
        String storage = null;
        File response = api.getSvgInStorageToPdf(srcPath, adjustPageSize, height, width, isLandscape, marginLeft, marginBottom, marginRight, marginTop, storage);

        // TODO: test validations
    }
    
    /**
     * Convert TeX file (located on storage) to PDF format and return resulting file in response.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTeXInStorageToPdfTest() throws ApiException {
        String srcPath = null;
        String storage = null;
        File response = api.getTeXInStorageToPdf(srcPath, storage);

        // TODO: test validations
    }
    
    /**
     * Convert web page to PDF format and return resulting file in response.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWebInStorageToPdfTest() throws ApiException {
        String url = null;
        Double height = null;
        Double width = null;
        Boolean isLandscape = null;
        Double marginLeft = null;
        Double marginBottom = null;
        Double marginRight = null;
        Double marginTop = null;
        String storage = null;
        File response = api.getWebInStorageToPdf(url, height, width, isLandscape, marginLeft, marginBottom, marginRight, marginTop, storage);

        // TODO: test validations
    }
    
    /**
     * Converts PDF document which contains XFA form (located on storage) to PDF with AcroForm and returns resulting file response content
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getXfaPdfInStorageToAcroFormTest() throws ApiException {
        String name = null;
        String folder = null;
        String storage = null;
        File response = api.getXfaPdfInStorageToAcroForm(name, folder, storage);

        // TODO: test validations
    }
    
    /**
     * Convert XML file (located on storage) to PDF format and return resulting file in response.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getXmlInStorageToPdfTest() throws ApiException {
        String srcPath = null;
        String xslFilePath = null;
        String storage = null;
        File response = api.getXmlInStorageToPdf(srcPath, xslFilePath, storage);

        // TODO: test validations
    }
    
    /**
     * Convert XPS file (located on storage) to PDF format and return resulting file in response.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getXpsInStorageToPdfTest() throws ApiException {
        String srcPath = null;
        String storage = null;
        File response = api.getXpsInStorageToPdf(srcPath, storage);

        // TODO: test validations
    }
    
    /**
     * Convert XslFo file (located on storage) to PDF format and return resulting file in response.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getXslFoInStorageToPdfTest() throws ApiException {
        String srcPath = null;
        String storage = null;
        File response = api.getXslFoInStorageToPdf(srcPath, storage);

        // TODO: test validations
    }
    
    /**
     * Convert HTML file (zip archive in request content) to PDF format and return resulting file in response.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postHtmlToPdfTest() throws ApiException {
        String htmlFileName = null;
        Double height = null;
        Double width = null;
        Boolean isLandscape = null;
        Double marginLeft = null;
        Double marginBottom = null;
        Double marginRight = null;
        Double marginTop = null;
        File response = api.postHtmlToPdf(htmlFileName, height, width, isLandscape, marginLeft, marginBottom, marginRight, marginTop);

        // TODO: test validations
    }
    
    /**
     * Converts PDF document (in request content) to XLSX format and uploads and returns resulting file in response content.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postPdfToXlsxTest() throws ApiException {
        Boolean insertBlankColumnAtFirst = null;
        Boolean minimizeTheNumberOfWorksheets = null;
        Boolean uniformWorksheets = null;
        String password = null;
        File file = null;
        File response = api.postPdfToXlsx(insertBlankColumnAtFirst, minimizeTheNumberOfWorksheets, uniformWorksheets, password, file);

        // TODO: test validations
    }
    
    /**
     * Convert APS file (located on storage) to PDF format and upload resulting file to storage.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putApsInStorageToPdfTest() throws ApiException {
        String name = null;
        String srcPath = null;
        String dstFolder = null;
        String storage = null;
        AsposeResponse response = api.putApsInStorageToPdf(name, srcPath, dstFolder, storage);

        // TODO: test validations
    }
    
    /**
     * Convert EPUB file (located on storage) to PDF format and upload resulting file to storage.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putEpubInStorageToPdfTest() throws ApiException {
        String name = null;
        String srcPath = null;
        String storage = null;
        String dstFolder = null;
        AsposeResponse response = api.putEpubInStorageToPdf(name, srcPath, storage, dstFolder);

        // TODO: test validations
    }
    
    /**
     * Convert HTML file (located on storage) to PDF format and upload resulting file to storage.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putHtmlInStorageToPdfTest() throws ApiException {
        String name = null;
        String srcPath = null;
        String htmlFileName = null;
        Double height = null;
        Double width = null;
        Boolean isLandscape = null;
        Double marginLeft = null;
        Double marginBottom = null;
        Double marginRight = null;
        Double marginTop = null;
        String dstFolder = null;
        String storage = null;
        AsposeResponse response = api.putHtmlInStorageToPdf(name, srcPath, htmlFileName, height, width, isLandscape, marginLeft, marginBottom, marginRight, marginTop, dstFolder, storage);

        // TODO: test validations
    }
    
    /**
     * Convert image file (located on storage) to PDF format and upload resulting file to storage.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putImageInStorageToPdfTest() throws ApiException {
        String name = null;
        ImageTemplatesRequest imageTemplates = null;
        String dstFolder = null;
        String storage = null;
        AsposeResponse response = api.putImageInStorageToPdf(name, imageTemplates, dstFolder, storage);

        // TODO: test validations
    }
    
    /**
     * Convert MD file (located on storage) to PDF format and upload resulting file to storage.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putMarkdownInStorageToPdfTest() throws ApiException {
        String name = null;
        String srcPath = null;
        String storage = null;
        String dstFolder = null;
        AsposeResponse response = api.putMarkdownInStorageToPdf(name, srcPath, storage, dstFolder);

        // TODO: test validations
    }
    
    /**
     * Convert MHT file (located on storage) to PDF format and upload resulting file to storage.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putMhtInStorageToPdfTest() throws ApiException {
        String name = null;
        String srcPath = null;
        Double height = null;
        Double width = null;
        Double marginLeft = null;
        Double marginBottom = null;
        Double marginRight = null;
        Double marginTop = null;
        String dstFolder = null;
        String storage = null;
        AsposeResponse response = api.putMhtInStorageToPdf(name, srcPath, height, width, marginLeft, marginBottom, marginRight, marginTop, dstFolder, storage);

        // TODO: test validations
    }
    
    /**
     * Convert PCL file (located on storage) to PDF format and upload resulting file to storage.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putPclInStorageToPdfTest() throws ApiException {
        String name = null;
        String srcPath = null;
        String dstFolder = null;
        String storage = null;
        AsposeResponse response = api.putPclInStorageToPdf(name, srcPath, dstFolder, storage);

        // TODO: test validations
    }
    
    /**
     * Convert PDFA file (located on storage) to PDF format and upload resulting file to storage.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putPdfAInStorageToPdfTest() throws ApiException {
        String name = null;
        String srcPath = null;
        String dstFolder = null;
        Boolean dontOptimize = null;
        String storage = null;
        AsposeResponse response = api.putPdfAInStorageToPdf(name, srcPath, dstFolder, dontOptimize, storage);

        // TODO: test validations
    }
    
    /**
     * Converts PDF document (in request content) to APS format and uploads resulting file to storage.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putPdfInRequestToApsTest() throws ApiException {
        String outPath = null;
        String storage = null;
        File file = null;
        AsposeResponse response = api.putPdfInRequestToAps(outPath, storage, file);

        // TODO: test validations
    }
    
    /**
     * Converts PDF document (in request content) to DOC format and uploads resulting file to storage.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putPdfInRequestToDocTest() throws ApiException {
        String outPath = null;
        Boolean addReturnToLineEnd = null;
        String format = null;
        Integer imageResolutionX = null;
        Integer imageResolutionY = null;
        Double maxDistanceBetweenTextLines = null;
        String mode = null;
        Boolean recognizeBullets = null;
        Double relativeHorizontalProximity = null;
        String storage = null;
        String password = null;
        File file = null;
        AsposeResponse response = api.putPdfInRequestToDoc(outPath, addReturnToLineEnd, format, imageResolutionX, imageResolutionY, maxDistanceBetweenTextLines, mode, recognizeBullets, relativeHorizontalProximity, storage, password, file);

        // TODO: test validations
    }
    
    /**
     * Converts PDF document (in request content) to EPUB format and uploads resulting file to storage.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putPdfInRequestToEpubTest() throws ApiException {
        String outPath = null;
        String contentRecognitionMode = null;
        String storage = null;
        File file = null;
        AsposeResponse response = api.putPdfInRequestToEpub(outPath, contentRecognitionMode, storage, file);

        // TODO: test validations
    }
    
    /**
     * Converts PDF document (in request content) to Html format and uploads resulting file to storage.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putPdfInRequestToHtmlTest() throws ApiException {
        String outPath = null;
        Integer additionalMarginWidthInPoints = null;
        Boolean compressSvgGraphicsIfAny = null;
        Boolean convertMarkedContentToLayers = null;
        String defaultFontName = null;
        String documentType = null;
        Boolean fixedLayout = null;
        Integer imageResolution = null;
        Integer minimalLineWidth = null;
        Boolean preventGlyphsGrouping = null;
        Boolean splitCssIntoPages = null;
        Boolean splitIntoPages = null;
        Boolean useZOrder = null;
        String antialiasingProcessing = null;
        String cssClassNamesPrefix = null;
        List<Integer> explicitListOfSavedPages = null;
        String fontEncodingStrategy = null;
        String fontSavingMode = null;
        String htmlMarkupGenerationMode = null;
        String lettersPositioningMethod = null;
        Boolean pagesFlowTypeDependsOnViewersScreenSize = null;
        String partsEmbeddingMode = null;
        String rasterImagesSavingMode = null;
        Boolean removeEmptyAreasOnTopAndBottom = null;
        Boolean saveShadowedTextsAsTransparentTexts = null;
        Boolean saveTransparentTexts = null;
        String specialFolderForAllImages = null;
        String specialFolderForSvgImages = null;
        Boolean trySaveTextUnderliningAndStrikeoutingInCss = null;
        String storage = null;
        Boolean flowLayoutParagraphFullWidth = null;
        String outputFormat = null;
        File file = null;
        AsposeResponse response = api.putPdfInRequestToHtml(outPath, additionalMarginWidthInPoints, compressSvgGraphicsIfAny, convertMarkedContentToLayers, defaultFontName, documentType, fixedLayout, imageResolution, minimalLineWidth, preventGlyphsGrouping, splitCssIntoPages, splitIntoPages, useZOrder, antialiasingProcessing, cssClassNamesPrefix, explicitListOfSavedPages, fontEncodingStrategy, fontSavingMode, htmlMarkupGenerationMode, lettersPositioningMethod, pagesFlowTypeDependsOnViewersScreenSize, partsEmbeddingMode, rasterImagesSavingMode, removeEmptyAreasOnTopAndBottom, saveShadowedTextsAsTransparentTexts, saveTransparentTexts, specialFolderForAllImages, specialFolderForSvgImages, trySaveTextUnderliningAndStrikeoutingInCss, storage, flowLayoutParagraphFullWidth, outputFormat, file);

        // TODO: test validations
    }
    
    /**
     * Converts PDF document (in request content) to MOBIXML format and uploads resulting ZIP archive file to storage.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putPdfInRequestToMobiXmlTest() throws ApiException {
        String outPath = null;
        String storage = null;
        File file = null;
        AsposeResponse response = api.putPdfInRequestToMobiXml(outPath, storage, file);

        // TODO: test validations
    }
    
    /**
     * Converts PDF document (in request content) to PdfA format and uploads resulting file to storage.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putPdfInRequestToPdfATest() throws ApiException {
        String outPath = null;
        String type = null;
        String storage = null;
        String password = null;
        File file = null;
        AsposeResponse response = api.putPdfInRequestToPdfA(outPath, type, storage, password, file);

        // TODO: test validations
    }
    
    /**
     * Converts PDF document (in request content) to PPTX format and uploads resulting file to storage.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putPdfInRequestToPptxTest() throws ApiException {
        String outPath = null;
        Boolean separateImages = null;
        Boolean slidesAsImages = null;
        String storage = null;
        String password = null;
        File file = null;
        AsposeResponse response = api.putPdfInRequestToPptx(outPath, separateImages, slidesAsImages, storage, password, file);

        // TODO: test validations
    }
    
    /**
     * Converts PDF document (in request content) to SVG format and uploads resulting file to storage.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putPdfInRequestToSvgTest() throws ApiException {
        String outPath = null;
        String storage = null;
        String password = null;
        File file = null;
        AsposeResponse response = api.putPdfInRequestToSvg(outPath, storage, password, file);

        // TODO: test validations
    }
    
    /**
     * Converts PDF document (in request content) to TeX format and uploads resulting file to storage.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putPdfInRequestToTeXTest() throws ApiException {
        String outPath = null;
        String storage = null;
        File file = null;
        AsposeResponse response = api.putPdfInRequestToTeX(outPath, storage, file);

        // TODO: test validations
    }
    
    /**
     * Converts PDF document (in request content) to TIFF format and uploads resulting file to storage.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putPdfInRequestToTiffTest() throws ApiException {
        String outPath = null;
        Double brightness = null;
        String compression = null;
        String colorDepth = null;
        Integer leftMargin = null;
        Integer rightMargin = null;
        Integer topMargin = null;
        Integer bottomMargin = null;
        String orientation = null;
        Boolean skipBlankPages = null;
        Integer width = null;
        Integer height = null;
        Integer xResolution = null;
        Integer yResolution = null;
        Integer pageIndex = null;
        Integer pageCount = null;
        String storage = null;
        File file = null;
        AsposeResponse response = api.putPdfInRequestToTiff(outPath, brightness, compression, colorDepth, leftMargin, rightMargin, topMargin, bottomMargin, orientation, skipBlankPages, width, height, xResolution, yResolution, pageIndex, pageCount, storage, file);

        // TODO: test validations
    }
    
    /**
     * Converts PDF document (in request content) to XLS format and uploads resulting file to storage.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putPdfInRequestToXlsTest() throws ApiException {
        String outPath = null;
        Boolean insertBlankColumnAtFirst = null;
        Boolean minimizeTheNumberOfWorksheets = null;
        Double scaleFactor = null;
        Boolean uniformWorksheets = null;
        String storage = null;
        String password = null;
        File file = null;
        AsposeResponse response = api.putPdfInRequestToXls(outPath, insertBlankColumnAtFirst, minimizeTheNumberOfWorksheets, scaleFactor, uniformWorksheets, storage, password, file);

        // TODO: test validations
    }
    
    /**
     * Converts PDF document (in request content) to XLSX format and uploads resulting file to storage.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putPdfInRequestToXlsxTest() throws ApiException {
        String outPath = null;
        Boolean insertBlankColumnAtFirst = null;
        Boolean minimizeTheNumberOfWorksheets = null;
        Double scaleFactor = null;
        Boolean uniformWorksheets = null;
        String storage = null;
        String password = null;
        File file = null;
        AsposeResponse response = api.putPdfInRequestToXlsx(outPath, insertBlankColumnAtFirst, minimizeTheNumberOfWorksheets, scaleFactor, uniformWorksheets, storage, password, file);

        // TODO: test validations
    }
    
    /**
     * Converts PDF document (in request content) to XML format and uploads resulting file to storage.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putPdfInRequestToXmlTest() throws ApiException {
        String outPath = null;
        String storage = null;
        File file = null;
        AsposeResponse response = api.putPdfInRequestToXml(outPath, storage, file);

        // TODO: test validations
    }
    
    /**
     * Converts PDF document (in request content) to XPS format and uploads resulting file to storage.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putPdfInRequestToXpsTest() throws ApiException {
        String outPath = null;
        String storage = null;
        File file = null;
        AsposeResponse response = api.putPdfInRequestToXps(outPath, storage, file);

        // TODO: test validations
    }
    
    /**
     * Converts PDF document (located on storage) to APS format and uploads resulting file to storage
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putPdfInStorageToApsTest() throws ApiException {
        String name = null;
        String outPath = null;
        String folder = null;
        String storage = null;
        AsposeResponse response = api.putPdfInStorageToAps(name, outPath, folder, storage);

        // TODO: test validations
    }
    
    /**
     * Converts PDF document (located on storage) to DOC format and uploads resulting file to storage.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putPdfInStorageToDocTest() throws ApiException {
        String name = null;
        String outPath = null;
        Boolean addReturnToLineEnd = null;
        String format = null;
        Integer imageResolutionX = null;
        Integer imageResolutionY = null;
        Double maxDistanceBetweenTextLines = null;
        String mode = null;
        Boolean recognizeBullets = null;
        Double relativeHorizontalProximity = null;
        String folder = null;
        String storage = null;
        String password = null;
        AsposeResponse response = api.putPdfInStorageToDoc(name, outPath, addReturnToLineEnd, format, imageResolutionX, imageResolutionY, maxDistanceBetweenTextLines, mode, recognizeBullets, relativeHorizontalProximity, folder, storage, password);

        // TODO: test validations
    }
    
    /**
     * Converts PDF document (located on storage) to EPUB format and uploads resulting file to storage
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putPdfInStorageToEpubTest() throws ApiException {
        String name = null;
        String outPath = null;
        String contentRecognitionMode = null;
        String folder = null;
        String storage = null;
        AsposeResponse response = api.putPdfInStorageToEpub(name, outPath, contentRecognitionMode, folder, storage);

        // TODO: test validations
    }
    
    /**
     * Converts PDF document (located on storage) to Html format and uploads resulting file to storage
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putPdfInStorageToHtmlTest() throws ApiException {
        String name = null;
        String outPath = null;
        Integer additionalMarginWidthInPoints = null;
        Boolean compressSvgGraphicsIfAny = null;
        Boolean convertMarkedContentToLayers = null;
        String defaultFontName = null;
        String documentType = null;
        Boolean fixedLayout = null;
        Integer imageResolution = null;
        Integer minimalLineWidth = null;
        Boolean preventGlyphsGrouping = null;
        Boolean splitCssIntoPages = null;
        Boolean splitIntoPages = null;
        Boolean useZOrder = null;
        String antialiasingProcessing = null;
        String cssClassNamesPrefix = null;
        List<Integer> explicitListOfSavedPages = null;
        String fontEncodingStrategy = null;
        String fontSavingMode = null;
        String htmlMarkupGenerationMode = null;
        String lettersPositioningMethod = null;
        Boolean pagesFlowTypeDependsOnViewersScreenSize = null;
        String partsEmbeddingMode = null;
        String rasterImagesSavingMode = null;
        Boolean removeEmptyAreasOnTopAndBottom = null;
        Boolean saveShadowedTextsAsTransparentTexts = null;
        Boolean saveTransparentTexts = null;
        String specialFolderForAllImages = null;
        String specialFolderForSvgImages = null;
        Boolean trySaveTextUnderliningAndStrikeoutingInCss = null;
        String folder = null;
        String storage = null;
        Boolean flowLayoutParagraphFullWidth = null;
        String outputFormat = null;
        AsposeResponse response = api.putPdfInStorageToHtml(name, outPath, additionalMarginWidthInPoints, compressSvgGraphicsIfAny, convertMarkedContentToLayers, defaultFontName, documentType, fixedLayout, imageResolution, minimalLineWidth, preventGlyphsGrouping, splitCssIntoPages, splitIntoPages, useZOrder, antialiasingProcessing, cssClassNamesPrefix, explicitListOfSavedPages, fontEncodingStrategy, fontSavingMode, htmlMarkupGenerationMode, lettersPositioningMethod, pagesFlowTypeDependsOnViewersScreenSize, partsEmbeddingMode, rasterImagesSavingMode, removeEmptyAreasOnTopAndBottom, saveShadowedTextsAsTransparentTexts, saveTransparentTexts, specialFolderForAllImages, specialFolderForSvgImages, trySaveTextUnderliningAndStrikeoutingInCss, folder, storage, flowLayoutParagraphFullWidth, outputFormat);

        // TODO: test validations
    }
    
    /**
     * Converts PDF document (located on storage) to MOBIXML format and uploads resulting ZIP archive file to storage
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putPdfInStorageToMobiXmlTest() throws ApiException {
        String name = null;
        String outPath = null;
        String folder = null;
        String storage = null;
        AsposeResponse response = api.putPdfInStorageToMobiXml(name, outPath, folder, storage);

        // TODO: test validations
    }
    
    /**
     * Converts PDF document (located on storage) to PdfA format and uploads resulting file to storage
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putPdfInStorageToPdfATest() throws ApiException {
        String name = null;
        String outPath = null;
        String type = null;
        String folder = null;
        String storage = null;
        String password = null;
        AsposeResponse response = api.putPdfInStorageToPdfA(name, outPath, type, folder, storage, password);

        // TODO: test validations
    }
    
    /**
     * Converts PDF document (located on storage) to PPTX format and uploads resulting file to storage
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putPdfInStorageToPptxTest() throws ApiException {
        String name = null;
        String outPath = null;
        Boolean separateImages = null;
        Boolean slidesAsImages = null;
        String folder = null;
        String storage = null;
        String password = null;
        AsposeResponse response = api.putPdfInStorageToPptx(name, outPath, separateImages, slidesAsImages, folder, storage, password);

        // TODO: test validations
    }
    
    /**
     * Converts PDF document (located on storage) to SVG format and uploads resulting file to storage
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putPdfInStorageToSvgTest() throws ApiException {
        String name = null;
        String outPath = null;
        String folder = null;
        String storage = null;
        String password = null;
        AsposeResponse response = api.putPdfInStorageToSvg(name, outPath, folder, storage, password);

        // TODO: test validations
    }
    
    /**
     * Converts PDF document (located on storage) to TeX format and uploads resulting file to storage
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putPdfInStorageToTeXTest() throws ApiException {
        String name = null;
        String outPath = null;
        String folder = null;
        String storage = null;
        AsposeResponse response = api.putPdfInStorageToTeX(name, outPath, folder, storage);

        // TODO: test validations
    }
    
    /**
     * Converts PDF document (located on storage) to TIFF format and uploads resulting file to storage
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putPdfInStorageToTiffTest() throws ApiException {
        String name = null;
        String outPath = null;
        Double brightness = null;
        String compression = null;
        String colorDepth = null;
        Integer leftMargin = null;
        Integer rightMargin = null;
        Integer topMargin = null;
        Integer bottomMargin = null;
        String orientation = null;
        Boolean skipBlankPages = null;
        Integer width = null;
        Integer height = null;
        Integer xResolution = null;
        Integer yResolution = null;
        Integer pageIndex = null;
        Integer pageCount = null;
        String folder = null;
        String storage = null;
        AsposeResponse response = api.putPdfInStorageToTiff(name, outPath, brightness, compression, colorDepth, leftMargin, rightMargin, topMargin, bottomMargin, orientation, skipBlankPages, width, height, xResolution, yResolution, pageIndex, pageCount, folder, storage);

        // TODO: test validations
    }
    
    /**
     * Converts PDF document (located on storage) to XLS format and uploads resulting file to storage
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putPdfInStorageToXlsTest() throws ApiException {
        String name = null;
        String outPath = null;
        Boolean insertBlankColumnAtFirst = null;
        Boolean minimizeTheNumberOfWorksheets = null;
        Double scaleFactor = null;
        Boolean uniformWorksheets = null;
        String folder = null;
        String storage = null;
        String password = null;
        AsposeResponse response = api.putPdfInStorageToXls(name, outPath, insertBlankColumnAtFirst, minimizeTheNumberOfWorksheets, scaleFactor, uniformWorksheets, folder, storage, password);

        // TODO: test validations
    }
    
    /**
     * Converts PDF document (located on storage) to XLSX format and uploads resulting file to storage
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putPdfInStorageToXlsxTest() throws ApiException {
        String name = null;
        String outPath = null;
        Boolean insertBlankColumnAtFirst = null;
        Boolean minimizeTheNumberOfWorksheets = null;
        Double scaleFactor = null;
        Boolean uniformWorksheets = null;
        String folder = null;
        String storage = null;
        String password = null;
        AsposeResponse response = api.putPdfInStorageToXlsx(name, outPath, insertBlankColumnAtFirst, minimizeTheNumberOfWorksheets, scaleFactor, uniformWorksheets, folder, storage, password);

        // TODO: test validations
    }
    
    /**
     * Converts PDF document (located on storage) to XML format and uploads resulting file to storage
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putPdfInStorageToXmlTest() throws ApiException {
        String name = null;
        String outPath = null;
        String folder = null;
        String storage = null;
        AsposeResponse response = api.putPdfInStorageToXml(name, outPath, folder, storage);

        // TODO: test validations
    }
    
    /**
     * Converts PDF document (located on storage) to XPS format and uploads resulting file to storage
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putPdfInStorageToXpsTest() throws ApiException {
        String name = null;
        String outPath = null;
        String folder = null;
        String storage = null;
        AsposeResponse response = api.putPdfInStorageToXps(name, outPath, folder, storage);

        // TODO: test validations
    }
    
    /**
     * Convert PS file (located on storage) to PDF format and upload resulting file to storage.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putPsInStorageToPdfTest() throws ApiException {
        String name = null;
        String srcPath = null;
        String dstFolder = null;
        String storage = null;
        AsposeResponse response = api.putPsInStorageToPdf(name, srcPath, dstFolder, storage);

        // TODO: test validations
    }
    
    /**
     * Convert SVG file (located on storage) to PDF format and upload resulting file to storage.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSvgInStorageToPdfTest() throws ApiException {
        String name = null;
        String srcPath = null;
        Boolean adjustPageSize = null;
        Double height = null;
        Double width = null;
        Boolean isLandscape = null;
        Double marginLeft = null;
        Double marginBottom = null;
        Double marginRight = null;
        Double marginTop = null;
        String dstFolder = null;
        String storage = null;
        AsposeResponse response = api.putSvgInStorageToPdf(name, srcPath, adjustPageSize, height, width, isLandscape, marginLeft, marginBottom, marginRight, marginTop, dstFolder, storage);

        // TODO: test validations
    }
    
    /**
     * Convert TeX file (located on storage) to PDF format and upload resulting file to storage.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putTeXInStorageToPdfTest() throws ApiException {
        String name = null;
        String srcPath = null;
        String dstFolder = null;
        String storage = null;
        AsposeResponse response = api.putTeXInStorageToPdf(name, srcPath, dstFolder, storage);

        // TODO: test validations
    }
    
    /**
     * Convert web page to PDF format and upload resulting file to storage.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putWebInStorageToPdfTest() throws ApiException {
        String name = null;
        String url = null;
        Double height = null;
        Double width = null;
        Boolean isLandscape = null;
        Double marginLeft = null;
        Double marginBottom = null;
        Double marginRight = null;
        Double marginTop = null;
        String dstFolder = null;
        String storage = null;
        AsposeResponse response = api.putWebInStorageToPdf(name, url, height, width, isLandscape, marginLeft, marginBottom, marginRight, marginTop, dstFolder, storage);

        // TODO: test validations
    }
    
    /**
     * Converts PDF document which contains XFA form (in request content) to PDF with AcroForm and uploads resulting file to storage.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putXfaPdfInRequestToAcroFormTest() throws ApiException {
        String outPath = null;
        String storage = null;
        File file = null;
        AsposeResponse response = api.putXfaPdfInRequestToAcroForm(outPath, storage, file);

        // TODO: test validations
    }
    
    /**
     * Converts PDF document which contains XFA form (located on storage) to PDF with AcroForm and uploads resulting file to storage
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putXfaPdfInStorageToAcroFormTest() throws ApiException {
        String name = null;
        String outPath = null;
        String folder = null;
        String storage = null;
        AsposeResponse response = api.putXfaPdfInStorageToAcroForm(name, outPath, folder, storage);

        // TODO: test validations
    }
    
    /**
     * Convert XML file (located on storage) to PDF format and upload resulting file to storage.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putXmlInStorageToPdfTest() throws ApiException {
        String name = null;
        String srcPath = null;
        String xslFilePath = null;
        String dstFolder = null;
        String storage = null;
        AsposeResponse response = api.putXmlInStorageToPdf(name, srcPath, xslFilePath, dstFolder, storage);

        // TODO: test validations
    }
    
    /**
     * Convert XPS file (located on storage) to PDF format and upload resulting file to storage.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putXpsInStorageToPdfTest() throws ApiException {
        String name = null;
        String srcPath = null;
        String dstFolder = null;
        String storage = null;
        AsposeResponse response = api.putXpsInStorageToPdf(name, srcPath, dstFolder, storage);

        // TODO: test validations
    }
    
    /**
     * Convert XslFo file (located on storage) to PDF format and upload resulting file to storage.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putXslFoInStorageToPdfTest() throws ApiException {
        String name = null;
        String srcPath = null;
        String dstFolder = null;
        String storage = null;
        AsposeResponse response = api.putXslFoInStorageToPdf(name, srcPath, dstFolder, storage);

        // TODO: test validations
    }
    
}
