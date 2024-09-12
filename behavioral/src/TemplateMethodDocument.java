public abstract class TemplateMethodDocument {
    // Template Method
    public final void createDocument() {
        formatDocument();
        addContent();
        saveDocument();
    }

    // Steps of the Template Method
    abstract void formatDocument(); // Abstract method - subclass will implement
    abstract void addContent(); // Abstract method - subclass will implement
    void saveDocument() { // Concrete method - fixed step
        System.out.println("Document is saved.");
    }
}

// Concrete Class: PDFDocument
class PDFDocument extends TemplateMethodDocument {
    @Override
    void formatDocument() {
        System.out.println("Formatting document as PDF...");
    }

    @Override
    void addContent() {
        System.out.println("Adding content to PDF document...");
    }
}

// Concrete Class: WordDocument
class WordDocument extends TemplateMethodDocument {
    @Override
    void formatDocument() {
        System.out.println("Formatting document as Word...");
    }

    @Override
    void addContent() {
        System.out.println("Adding content to Word document...");
    }
}