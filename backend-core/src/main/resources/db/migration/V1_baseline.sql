-- baseline schema (establishes Flyway versioning)
CREATE TABLE IF NOT EXISTS __baseline_marker (id INT PRIMARY KEY DEFAULT 1);
