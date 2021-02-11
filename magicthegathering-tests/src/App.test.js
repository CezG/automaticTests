import fetcher from "./API";

describe("Magic the gathering api", () => {
  beforeEach(() => {
    jest.setTimeout(10000);
  });
  it("should return data", () => {
    return fetcher("https://api.magicthegathering.io/v1/cards").then(
      (response) => {
        expect(response).toBeDefined();
      }
    );
  });
  it("should throw error with bad url", () => {
    return fetcher("https://api.magicthegathering.io/v1/karty").catch(
      (error) => {
        expect(error).toBeDefined();
      }
    );
  });
  it("should be a number in card.number", () => {
    return fetcher("https://api.magicthegathering.io/v1/cards").then(
      (response) => {
        response.data.cards.forEach((card) => {
          expect(typeof parseInt(card.number)).toBe("number");
        });
      }
    );
  });
  it("results object should contain index, name and url keys", () => {
    return fetcher("https://api.magicthegathering.io/v1/cards").then(
      (response) => {
        response.data.cards.forEach((card) => {
          expect(Object.keys(card)).toContain("name");
        });
      }
    );
  });
});
