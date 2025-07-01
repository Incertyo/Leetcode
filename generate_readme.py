import os

SRC_DIR = "src"
README_FILE = "README.md"

def generate_table(problem_nums):
    table_header = "| 🔢 Problem # | Status   |\n|-------------|----------|\n"
    table_rows = ""
    for num in sorted(problem_nums, key=lambda x: int(x)):
        table_rows += f"| {num:<11} | ✅ Done  |\n"
    return table_header + table_rows

def update_readme(table_content):
    with open(README_FILE, "r", encoding="utf-8") as f:
        content = f.read()

    start_tag = "## 📦 Progress So Far"
    if start_tag not in content:
        print("❌ Progress section not found in README.md")
        return

    before = content.split(start_tag)[0]
    after = content.split(start_tag)[1]
    new_content = before + start_tag + "\n" + table_content + "\n"

    with open(README_FILE, "w", encoding="utf-8") as f:
        f.write(new_content)

    print("✅ README.md updated with latest progress!")

def main():
    if not os.path.exists(SRC_DIR):
        print(f"❌ '{SRC_DIR}' directory not found.")
        return

    problem_nums = [name for name in os.listdir(SRC_DIR) if os.path.isdir(os.path.join(SRC_DIR, name)) and name.isdigit()]
    if not problem_nums:
        print("⚠️ No problem folders found.")
        return

    table_content = generate_table(problem_nums)
    update_readme(table_content)

if __name__ == "__main__":
    main()
