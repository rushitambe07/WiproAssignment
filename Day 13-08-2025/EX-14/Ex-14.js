let cities = ["Pune", "Mumbai", "Delhi", "Nagpur", "Ahmedabad", "Bengaluru"];

    function loadCities() {
        cities.sort();

        let dropdown = document.getElementById("cityDropdown");

        dropdown.length = 1;

        for (let i = 0; i < cities.length; i++) {
            let option = document.createElement("option");
            option.text = cities[i];
            option.value = cities[i];
            dropdown.add(option);
        }
    }