
public class Problem2 {
    private StringBuilder query;
    
    public Problem2() {
        query = new StringBuilder();
    }
    
    public void startSelect() {
        query.append("SELECT ");
    }
    
    public void addSelectColumn(String column) {
        if (query.toString().endsWith("SELECT ")) {
            query.append(column);
        } else {
            query.append(", ").append(column);
        }
    }
    
    public void addFrom(String table) {
        query.append(" FROM ").append(table);
    }
    
    public void addJoin(String table, String condition) {
        query.append(" JOIN ").append(table).append(" ON ").append(condition);
    }
    
    public void addWhereCondition(String condition, String operator) {
        if (query.indexOf("WHERE") == -1) {
            query.append(" WHERE ").append(condition);
        } else {
            query.append(" ").append(operator).append(" ").append(condition);
        }
    }
    
    public void addOrderBy(String column, String direction) {
        if (query.indexOf("ORDER BY") == -1) {
            query.append(" ORDER BY ").append(column).append(" ").append(direction);
        } else {
            query.append(", ").append(column).append(" ").append(direction);
        }
    }
    
    public void setLimit(int limit) {
        query.append(" LIMIT ").append(limit);
    }
    
    public String build() {
        return query.toString();
    }

    public static void main(String[] args) {
        // Problem 2: SQL Builder
        Problem2 builder = new Problem2();
        builder.startSelect();
        builder.addSelectColumn("id");
        builder.addSelectColumn("name");
        builder.addSelectColumn("email");
        builder.addSelectColumn("age");
        builder.addSelectColumn("status");
        
        builder.addFrom("users");
        builder.addJoin("orders", "users.id = orders.user_id");
        builder.addWhereCondition("age > 18", "AND"); // Logic might need adjustment for first condition vs subsequent
        // My implementation assumes first call adds WHERE, operator is for subsequent. 
        // Let's refine usage: first call doesn't need operator, but method signature asks for it.
        // Assuming user passes "AND" or "OR" for logic if WHERE exists.
        // Actually, let's fix logic: If no WHERE, ignore operator? Or user passes empty operator for first?
        // Prompt says: addWhereCondition(condition, operator).
        // Let's assume usage: addWhere("age > 18", "") for first? 
        // Or better logic in method: if no WHERE, append " WHERE condition", else " operator condition".
        // I'll reset query for clean example.
    }
}

// Re-implementing class with main method test
class SQLQueryBuilder {
    private StringBuilder query = new StringBuilder();
    private boolean hasWhere = false;
    private boolean hasOrderBy = false;
    
    public SQLQueryBuilder() {
        query.append("SELECT ");
    }
    
    public void addSelectColumn(String column) {
        if (query.length() > 7 && query.charAt(query.length()-1) != ' ') { // "SELECT " is 7 chars
             query.append(", ");
        }
        query.append(column);
    }
    
    public void addFrom(String table) {
        query.append(" FROM ").append(table);
    }
    
    public void addJoin(String table, String condition) {
        query.append(" JOIN ").append(table).append(" ON ").append(condition);
    }
    
    public void addWhereCondition(String condition, String operator) {
        if (!hasWhere) {
            query.append(" WHERE ").append(condition);
            hasWhere = true;
        } else {
            query.append(" ").append(operator).append(" ").append(condition);
        }
    }
    
    public void addOrderBy(String column, String direction) {
        if (!hasOrderBy) {
            query.append(" ORDER BY ").append(column).append(" ").append(direction);
            hasOrderBy = true;
        } else {
            query.append(", ").append(column).append(" ").append(direction);
        }
    }
    
    public void setLimit(int limit) {
        query.append(" LIMIT ").append(limit);
    }
    
    public String build() {
        return query.toString();
    }
    
    public static void main(String[] args) {
        SQLQueryBuilder builder = new SQLQueryBuilder();
        builder.addSelectColumn("column1");
        builder.addSelectColumn("column2");
        builder.addSelectColumn("column3");
        builder.addFrom("table1");
        builder.addJoin("table2", "condition");
        builder.addWhereCondition("condition1", "");
        builder.addWhereCondition("condition2", "AND");
        builder.addOrderBy("column1", "ASC");
        builder.addOrderBy("column2", "DESC");
        builder.setLimit(100);
        
        System.out.println(builder.build());
        System.out.println("Query Length: " + builder.build().length());
    }
}
