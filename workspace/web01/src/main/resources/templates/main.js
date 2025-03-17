const gridOptoins = {
  rowDate: [
    { make: "Tesla", model: "Model Y", price: 64950, electric: true },
    { make: "Ford", model: "F-Series", price: 33850, electric: false },
    { make: "Toyota", model: "Corolla", price: 29600, electric: false },
  ],
  columnDefs: [
    { field: "make" },
    { field: "model" },
    { field: "price" },
    { field: "electric" },
  ],
};

const eDiv = document.querySelector("#myGrid");
const gridApi = agGrid.createGrid(eDiv, gridOptions);
