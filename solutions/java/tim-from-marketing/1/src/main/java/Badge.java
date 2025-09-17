class Badge {
    public String print(Integer id, String name, String department) {
        String idText = id != null ? "[" + id + "] - " : "";
        String departmentText = department != null ? department.toUpperCase() : "OWNER";
        
        return idText + name + " - " + departmentText;
    }
}
