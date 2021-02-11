import React, { useState, useEffect } from "react";
import "./App.css";
import fetchData from "./API";

const App = () => {
  const [dataReady, setDataReady] = useState(false);
  const [responseData, setResponseData] = useState();
  const getApiData = () => {
    try {
      fetchData("https://api.magicthegathering.io/v1/cards").then(
        (response) => {
          setDataReady(true);
          setResponseData(response.data);
        }
      );
    } catch (err) {
      console.log(err);
    }
  };

  useEffect(() => {
    getApiData();
  }, [responseData]);

  return (
    <div className="App">
      <header className="App-header">
        <h1>Magic the gathering - cards</h1>
      </header>
      <ul>
        {dataReady
          ? responseData?.cards.map((cards) => <li>{cards.name}</li>)
          : "LOADING"}
      </ul>
    </div>
  );
};

export default App;
