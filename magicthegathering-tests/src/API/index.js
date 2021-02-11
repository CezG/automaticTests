import axios from "axios";

const fetchData = (url) => {
  return axios({
    method: "GET",
    url: url,
  });
};

export default fetchData;
