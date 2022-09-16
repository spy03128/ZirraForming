import { Html } from "@react-three/drei";
import { motion } from "framer-motion";
import styled from "styled-components";
import { SumCard } from "../../items/Card";

const Wrapper = styled(motion.div)`
  display: grid;
  grid-template-columns: repeat(4, 1fr);
  grid-template-rows: 1fr;
  background-color: white;
  width: 90vw;
  min-width: 700px;
  max-width: 1400px;
  height: 200px;

  @media screen and (max-width: 992px) {
    grid-template-columns: repeat(2, 1fr);
    grid-template-rows: 1fr 1fr;
  }
`;

function Summary() {
  return (
    <Html center position={[0, -200, 0]}>
      <Wrapper>
        <SumCard />
      </Wrapper>
    </Html>
  );
}

export default Summary;
